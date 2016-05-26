package evaluation;

import nottex_ast.NottexNode;
import nottex_ast.StringNode;
import nottex_ast.TextNode;

public class FunctionEvaluation {

    //
    // NB! All methods
    //      1) must be static
    //      2) must have a return type of NottexNode
    //      3) must have parameters of type: (StringNode | BlockNode)
    //

    public static NottexNode don(StringNode string1, StringNode string2) {
        return new TextNode(String.valueOf(
                Integer.parseInt(string1.getValue()) +
                        Integer.parseInt(string2.getValue())));
    }

}
