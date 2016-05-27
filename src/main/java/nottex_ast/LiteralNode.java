package nottex_ast;

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
    String prettyPrint(String indent) {
        return indent + "Literal: " + toString();
    }
}
