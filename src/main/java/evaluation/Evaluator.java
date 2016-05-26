package evaluation;

import nottex_ast.NottexNode;
import nottex_ast.StringNode;
import nottex_ast.TextNode;

public class Evaluator {

    //
    // NB! Methods must have a return type of NottexNode and
    // arguments must be \in {StringNode, BlockNode}
    //

    public static NottexNode don(StringNode string1, StringNode string2) {
        return new TextNode(String.valueOf(
                Integer.parseInt(string1.getValue()) +
                        Integer.parseInt(string2.getValue())));
    }

}
