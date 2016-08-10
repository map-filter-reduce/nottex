package nottexast;

import nottexast.literals.LiteralAstNode;

public class FunctionArgAstNode extends NottexAstNode {

    private final LiteralAstNode literalArg;
    private final FunctionCallAstNode funArg;

    public FunctionArgAstNode(FunctionCallAstNode funArg) {
        this.funArg = funArg;
        this.literalArg = null;
    }

    public FunctionArgAstNode(LiteralAstNode stringArg) {
        this.literalArg = stringArg;
        this.funArg = null;
    }

    public LiteralAstNode getLiteralArg() {
        return literalArg;
    }

    public FunctionCallAstNode getFunArg() {
        return funArg;
    }

    /**
     * Method for checking if FunctionArgAstNode is holding LiteralAstNode or FunctionCallAstNode
     * @return true if is holding FunctionCallAstNode
     */
    public boolean isFunctionCall() {
        return funArg != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FunctionArgAstNode that = (FunctionArgAstNode) o;

        if (literalArg != null ? !literalArg.equals(that.literalArg) : that.literalArg != null) return false;
        return funArg != null ? funArg.equals(that.funArg) : that.funArg == null;

    }

    @Override
    public int hashCode() {
        int result = literalArg != null ? literalArg.hashCode() : 0;
        result = 31 * result + (funArg != null ? funArg.hashCode() : 0);
        return result;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "Arg: " + "\n" +
                (isFunctionCall() ?
                        funArg.prettyPrint(indent + INDENT) : literalArg.prettyPrint(indent + INDENT));
    }

}
