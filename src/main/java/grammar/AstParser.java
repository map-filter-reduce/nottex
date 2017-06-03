package grammar;

import nottexast.*;
import nottexast.literals.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.stream.Collectors;


public class AstParser {


    /**
     * Method takes in code written in NoTTeX and generates corresponding AST.
     * <p>
     * If NoTTeX function parameters are arithmetic operations, then they will be evaluated.
     *
     * @param code - String written in NoTTeX syntax
     * @return corresponding AST
     */
    public static NottexNode parse(String code) {
        NottexLexer NottexLexer = new NottexLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(NottexLexer);
        NottexParser parser = new NottexParser(tokens);
        return parse(parser.markupText());
    }


    /**
     * Method traverses ANTLR generated parse tree and returns AST
     *
     * @param node - parse tree node
     * @return AST tree node
     */
    private static NottexNode parse(ParseTree node) {

        if (node instanceof NottexParser.MarkupTextContext) {
            NottexParser.MarkupTextContext markupText = (NottexParser.MarkupTextContext) node;
            BlockNode root = new BlockNode();
            for (int i = 0; i < markupText.getChildCount(); i++) {
                root.addChild(
                        parse(markupText.getChild(i)));
            }
            return root;

        } else if (node instanceof NottexParser.FunctionCallContext) {
            NottexParser.FunctionCallContext functionContext = (NottexParser.FunctionCallContext) node;
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
                    else
                        throw new AssertionError("Expected LiteralNode or FunctionCallNode, got: " + argAsNode.getClass());
                }
            }
            return functionCall;

        } else if (node instanceof NottexParser.TagUseContext) {
            List<String> tagNames = ((NottexParser.TagUseContext) node)
                    .namesNode
                    .names
                    .stream()
                    .map(Token::getText)
                    .collect(Collectors.toList());

            NottexParser.MarkupTextContext content = ((NottexParser.TagUseContext) node).content;
            if (content == null)
                return new TagUseNode(null, tagNames);
            else
                return new TagUseNode(((BlockNode) parse(content)).getChildren(), tagNames);

        } else if (node instanceof NottexParser.TextContext) {
            return new TextNode(
                    ((NottexParser.TextContext) node).content
                            .stream()
                            .map(Token::getText)
                            .collect(Collectors.joining())
            );

        } else if (node instanceof NottexParser.StringContext) {
            List<Token> content = ((NottexParser.StringContext) node).content;
            if (content == null)
                return new StringNode("");

            return new StringNode(content
                    .stream()
                    .map(Token::getText)
                    .collect(Collectors.joining())
            );
        } else if (node instanceof NottexParser.FuncArgContext) {
            return parse(node.getChild(0));

        } else if (node instanceof NottexParser.ExprAddContext) {
            // Evaluate binary operation: addition
            NottexParser.ExprAddContext addContext = (NottexParser.ExprAddContext) node;
            return evalExpr((NumberNode) parse(addContext.left), (NumberNode) parse(addContext.right), Operator.ADDITION);

        } else if (node instanceof NottexParser.ExprSubtractContext) {
            // Evaluate binary operation: subtraction
            NottexParser.ExprSubtractContext subtractContext = (NottexParser.ExprSubtractContext) node;
            return evalExpr((NumberNode) parse(subtractContext.left), (NumberNode) parse(subtractContext.right), Operator.SUBTRACTION);

        } else if (node instanceof NottexParser.SubExprContext ||
                node instanceof NottexParser.SubSubExprContext) {
            return parse(node.getChild(0));

        } else if (node instanceof NottexParser.ExprMultipContext) {
            // Evaluate binary operation: multiplication
            NottexParser.ExprMultipContext multipContext = (NottexParser.ExprMultipContext) node;
            return evalExpr((NumberNode) parse(multipContext.left), (NumberNode) parse(multipContext.right), Operator.MULTIPLICATION);

        } else if (node instanceof NottexParser.ExprDivisContext) {
            // Evaluate binary operation: division
            NottexParser.ExprDivisContext divisContext = (NottexParser.ExprDivisContext) node;
            return evalExpr((NumberNode) parse(divisContext.left), (NumberNode) parse(divisContext.right), Operator.DIVISION);

        } else if (node instanceof NottexParser.ExprMinusContext) {
            // Evaluate unary minus. We can think of this as an binary operation: -1 * expression
            NottexParser.ExprMinusContext minusContext = (NottexParser.ExprMinusContext) node;
            return minusContext.minuses.size() % 2 == 0 ?
                    parse(minusContext.expression) :
                    evalExpr(new IntNode(-1), (NumberNode) parse(minusContext.expression), Operator.MULTIPLICATION);
        } else if (node instanceof NottexParser.ExprParensContext) {
            return parse(((NottexParser.ExprParensContext) node).expression);

        } else if (node instanceof NottexParser.ExprNumberContext) {
            NottexParser.ExprNumberContext numberContext = (NottexParser.ExprNumberContext) node;
            return NumberNode.numberNode(numberContext.getText());

        } else {
            throw new AssertionError("Unexpected node found in parse tree traversal: " + node.getClass());
        }
    }

    /**
     * Method evaluates binary operation between two NumberNodes.
     * <p>
     * Supported operations: ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
     *
     * @param left     side of the operand
     * @param right    side of the operand
     * @param operator - Enum Operator: determines what kind of operation will be conducted
     * @return evaluated result
     */
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
                throw new AssertionError("Operation not implemented: " + operator.toString());
        }
    }

}


