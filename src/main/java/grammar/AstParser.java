package grammar;

import nottex_ast.*;
import nottex_ast.literals.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.stream.Collectors;


public class AstParser {


    public static NottexNode parse(String code) {
        // TODO
        ANTLRInputStream antlrInput = new ANTLRInputStream(code);
        nottexLexer nottexLexer = new nottexLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(nottexLexer);
        nottexParser parser = new nottexParser(tokens);
        ParseTree tree = parser.markupText();
        return parse(tree);
    }


    private static NottexNode parse(ParseTree node) {

        if (node instanceof nottexParser.MarkupTextContext) {
            nottexParser.MarkupTextContext markupText = (nottexParser.MarkupTextContext) node;
            BlockNode root = new BlockNode();
            for (int i = 0; i < markupText.getChildCount(); i++) {
                root.addChild(
                        parse(markupText.getChild(i)));
            }
            return root;

        } else if (node instanceof nottexParser.FunctionCallContext) {
            nottexParser.FunctionCallContext functionContext = (nottexParser.FunctionCallContext) node;
            FunctionCallNode functionCall = new FunctionCallNode(
                    functionContext.name
                            .stream()
                            .map(Token::getText)
                            .collect(Collectors.joining()));

            if (functionContext.argumentsNode != null) {
                // Add arguments if there are any
                List<NottexNode> argsAsNodes = functionContext
                        .argumentsNode
                        .argumentNodes
                        .stream()
                        .map(AstParser::parse)
                        .collect(Collectors.toList());

                for (NottexNode argAsNode : argsAsNodes) {
                    if (argAsNode instanceof LiteralNode)
                        functionCall.addArgument(new FunctionArgNode((LiteralNode) argAsNode));
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
            if (content == null)
                return new TagUseNode(null, tagNames);
            else
                return new TagUseNode(((BlockNode) parse(content)).getChildren(), tagNames);

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
            return parse(node.getChild(0));

        } else if (node instanceof nottexParser.ExprAddContext) {
            nottexParser.ExprAddContext addContext = (nottexParser.ExprAddContext) node;
            return evalExpr((NumberNode) parse(addContext.left), (NumberNode) parse(addContext.right), Operator.ADDITION);

        } else if (node instanceof nottexParser.ExprSubtractContext) {
            nottexParser.ExprSubtractContext subtractContext = (nottexParser.ExprSubtractContext) node;
            return evalExpr((NumberNode) parse(subtractContext.left), (NumberNode) parse(subtractContext.right), Operator.SUBTRACTION);

        } else if (node instanceof nottexParser.SubExprContext ||
                node instanceof nottexParser.SubSubExprContext) {
            return parse(node.getChild(0));

        } else if (node instanceof nottexParser.ExprMultipContext) {
            nottexParser.ExprMultipContext multipContext = (nottexParser.ExprMultipContext) node;
            return evalExpr((NumberNode) parse(multipContext.left), (NumberNode) parse(multipContext.right), Operator.MULTIPLICATION);

        } else if (node instanceof nottexParser.ExprDivisContext) {
            nottexParser.ExprDivisContext divisContext = (nottexParser.ExprDivisContext) node;
            return evalExpr((NumberNode) parse(divisContext.left), (NumberNode) parse(divisContext.right), Operator.DIVISION);

        } else if (node instanceof nottexParser.ExprMinusContext) {
            nottexParser.ExprMinusContext minusContext = (nottexParser.ExprMinusContext) node;
            return minusContext.minuses.size() % 2 == 0 ?
                    parse(minusContext.expression) :
                    evalExpr(new IntNode(-1), (NumberNode) parse(minusContext.expression), Operator.MULTIPLICATION);
        } else if (node instanceof nottexParser.ExprParensContext) {
            return parse(((nottexParser.ExprParensContext) node).expression);

        } else if (node instanceof nottexParser.ExprNumberContext) {
            nottexParser.ExprNumberContext numberContext = (nottexParser.ExprNumberContext) node;
            return NumberNode.numberNode(numberContext.getText());

        } else {
            throw new AssertionError();
        }
    }

    private static NumberNode evalExpr(NumberNode left, NumberNode right, Operator operator) {
        boolean isDoubleExpr = left instanceof DoubleNode || right instanceof DoubleNode;
        Number leftValue = left.getNumberValue();
        Number rightValue = right.getNumberValue();

        switch (operator) {
            case ADDITION:
                return isDoubleExpr ? new DoubleNode(leftValue.doubleValue() + rightValue.doubleValue()) :
                        new IntNode(leftValue.intValue() + rightValue.intValue());

            case SUBTRACTION:
                return isDoubleExpr ? new DoubleNode(leftValue.doubleValue() - rightValue.doubleValue()) :
                        new IntNode(leftValue.intValue() - rightValue.intValue());

            case MULTIPLICATION:
                return isDoubleExpr ? new DoubleNode(leftValue.doubleValue() * rightValue.doubleValue()) :
                        new IntNode(leftValue.intValue() * rightValue.intValue());

            case DIVISION:
                return isDoubleExpr ? new DoubleNode(leftValue.doubleValue() / rightValue.doubleValue()) :
                        new IntNode(leftValue.intValue() / rightValue.intValue());

            default:
                throw new AssertionError();
        }
    }

}


