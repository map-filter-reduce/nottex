package evaluation;

import nottex_ast.*;
import nottex_ast.literals.DoubleNode;
import nottex_ast.literals.IntNode;
import nottex_ast.literals.StringNode;

public class FunctionEvaluation {

    //
    // TODO: up for debate
    // NB! All methods
    //      1) must be static
    //      2) must have a return type of NottexNode
    //      3) must have parameters of type: (StringNode | BlockNode)
    //

    public static NottexNode don(StringNode string1, TextNode string2) {
        return new TextNode(String.valueOf(
                Integer.parseInt(string1.getValue()) +
                        Integer.parseInt(string2.getRawText())));
    }

    public static NottexNode don(StringNode string1, StringNode string2) {
        return new TextNode(String.valueOf(
                Integer.parseInt(string1.getValue()) +
                        Integer.parseInt(string2.getValue())));
    }

    public static NottexNode don(IntNode int1, IntNode int2) {
        return new TextNode(String.valueOf(int1.getValue().intValue() + int2.getValue().intValue()));
    }

    public static NottexNode don(DoubleNode int1, DoubleNode int2) {
        return new TextNode(String.valueOf(int1.getValue().doubleValue() + int2.getValue().doubleValue()));
    }

    public static NottexNode m(DoubleNode d1, DoubleNode d2, StringNode s1) {
        return new TextNode(
                s1.getValue()
        );
    }

    public static NottexNode m() {
        return new TextNode(
                "asdasdasdasdadqwd"
        );
    }

}
