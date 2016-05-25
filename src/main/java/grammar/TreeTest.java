package grammar;

import nottex_ast.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.stream.Collectors;


public class TreeTest {

    private static Node traverseTree(String code) {
        // TODO
        ANTLRInputStream antlrInput = new ANTLRInputStream(code);
        nottexLexer nottexLexer = new nottexLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(nottexLexer);
        nottexParser parser = new nottexParser(tokens);
        ParseTree tree = parser.markupText();
        return traverseTree(tree);
    }

    private static Node traverseTree(ParseTree node) {

        if (node == null) return null;

        if (node instanceof nottexParser.MarkupTextContext) {
            nottexParser.MarkupTextContext markupText = (nottexParser.MarkupTextContext) node;
            RootNode root = new RootNode();
            for (int i = 0; i < markupText.getChildCount(); i++) {
                root.addChild(
                        traverseTree(markupText.getChild(i)));
            }
            return root;

        } else if (node instanceof nottexParser.FunctionCallContext) {
            nottexParser.FunctionCallContext functionContext = (nottexParser.FunctionCallContext) node;
            FunctionCallNode functionCall = new FunctionCallNode(functionContext.name.getText());

            if (functionContext.argumentsNode != null) {
                // Add arguments if there are any
                List<Node> argsAsNodes = functionContext
                        .argumentsNode
                        .argumentNodes
                        .stream()
                        .map(TreeTest::traverseTree)
                        .collect(Collectors.toList());

                for (Node argAsNode : argsAsNodes) {
                    if (argAsNode instanceof StringNode)
                        functionCall.addArgument(new FunctionArgNode((StringNode) argAsNode));
                    else if (argAsNode instanceof FunctionCallNode)
                        functionCall.addArgument(new FunctionArgNode((FunctionCallNode) argAsNode));
                    else throw new AssertionError();
                }
            }
            return functionCall;

        } else if (node instanceof nottexParser.TagUseContext) {
            List<String> tagNames = ((nottexParser.TagUseContext) node)
                    .namesNode
                    .names
                    .stream()
                    .map(Token::getText)
                    .collect(Collectors.toList());


            nottexParser.MarkupTextContext content = ((nottexParser.TagUseContext) node).content;

            return new TagUseNode(traverseTree(content), tagNames);

        } else if (node instanceof nottexParser.TextContext) {
            return new TextNode(
                    ((nottexParser.TextContext) node).content
                            .stream()
                            .map(Token::getText)
                            .collect(Collectors.joining())
            );

        } else if (node instanceof nottexParser.StringContext) {
            List<Token> content = ((nottexParser.StringContext) node).content;
            if (content == null)
                return new StringNode("");


            return new StringNode(content
                    .stream()
                    .map(Token::getText)
                    .collect(Collectors.joining())
            );

        } else if (node instanceof nottexParser.FuncArgContext) {
            nottexParser.FuncArgContext argContext = (nottexParser.FuncArgContext) node;
            return traverseTree(argContext.getChild(0));
        }

        else {
            throw new AssertionError(node.getClass().getName());
        }

    }

    public static void main(String[] args) {

        System.out.println(traverseTree("::suvaline(\"abc\")").prettyPrint());
        System.out.println(traverseTree("::suvaline(\"\")").prettyPrint());
        System.out.println(traverseTree("::suvaline(\"\", ::f())").prettyPrint());
        System.out.println(traverseTree("::suvaline(\"\", ::f(\"\"))").prettyPrint());
        //System.out.println(traverseTree(",,tag1{}").prettyPrint(0));
        //traverseTree("::suvaline(\"arg1\",::d())");
        //System.out.println(traverseTree(",,tag1 , tag2 {}").prettyPrint(0));
        //System.out.println(traverseTree(",,tag1 , tag2 {twetwesdtsd}").prettyPrint(0));
        //traverseTree(",,tag1 , tag2 {::suvaline(\"arg1\",::d(::suvaline(\"arg1\",::d())))} ,,tag1 , tag2 {::suvaline(\"arg1\",::d(::suvaline(\"arg1\",::d())))} wfewefw");
        //System.out.println(traverseTree(" kfpowe wf we f, fwe ,  : wfefweefw").prettyPrint(0));
    }
}
