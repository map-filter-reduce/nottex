package evaluation;

import nottex_ast.NottexNode;
import nottex_ast.StringNode;
import nottex_ast.TextNode;

public class Evaluator {

    //
    // NB! Methods must have a return type of NottexNode and
    // arguments must be \in {StringNode, RootNode}
    //

    public static NottexNode don(StringNode string) {
        return new TextNode(string.getValue());
    }

}
