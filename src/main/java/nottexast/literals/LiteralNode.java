package nottexast.literals;

import nottexast.NottexNode;

public abstract class LiteralNode extends NottexNode {

    /**
     * Method used by prettyPrint
     */
    public abstract String toString();

    /**
     * Method for getting LiteralNode value as String
     *
     * @return value of the LiteralNode
     */
    public abstract String getStringRepr();


    /**
     * Method creates copy of the LiterNode
     *
     * @param root LiteralNode that will be copied
     * @return new instance of LiteralNode
     */
    public static LiteralNode copy(LiteralNode root) {
        if (root instanceof NumberNode) {
            return NumberNode.numberNode(((NumberNode) root).getNumberValue());
        } else if (root instanceof StringNode) {
            return new StringNode(((StringNode) root).getValue());
        } else throw new AssertionError();
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "Literal: " + toString();
    }
}
