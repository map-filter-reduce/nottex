package nottexast.literals;

import nottexast.NottexAstNode;

public abstract class LiteralAstNode extends NottexAstNode {

    /**
     * Method used by prettyPrint
     */
    public abstract String toString();

    /**
     * Method for getting LiteralAstNode value as String
     *
     * @return value of the LiteralAstNode
     */
    public abstract String getStringRepr();


    /**
     * Method creates copy of the LiterNode
     *
     * @param root LiteralAstNode that will be copied
     * @return new instance of LiteralAstNode
     */
    public static LiteralAstNode copy(LiteralAstNode root) {
        if (root instanceof NumberAstNode) {
            return NumberAstNode.numberNode(((NumberAstNode) root).getNumberValue());
        } else if (root instanceof StringAstNode) {
            return new StringAstNode(((StringAstNode) root).getValue());
        } else throw new AssertionError();
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "Literal: " + toString();
    }
}
