package nottex_ast.literals;

import nottex_ast.NottexNode;

@SuppressWarnings("ALL")
public abstract class LiteralNode extends NottexNode {

    public abstract String toString();

    public static LiteralNode copy(LiteralNode root) {
        if (root instanceof NumberNode) {
            return NumberNode.numberNode(((NumberNode) root).getValue());
        } else if (root instanceof StringNode) {
            return new StringNode(((StringNode) root).getValue());
        } else throw new AssertionError();
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "Literal: " + toString();
    }
}
