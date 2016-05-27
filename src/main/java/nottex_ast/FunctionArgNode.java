package nottex_ast;

import nottex_ast.literals.LiteralNode;

public class FunctionArgNode extends NottexNode {

    private final LiteralNode literalArg;
    private final FunctionCallNode funArg;

    public FunctionArgNode(FunctionCallNode funArg) {
        this.funArg = funArg;
        this.literalArg = null;
    }

    public FunctionArgNode(LiteralNode stringArg) {
        this.literalArg = stringArg;
        this.funArg = null;
    }

    public LiteralNode getLiteralArg() {
        return literalArg;
    }

    public FunctionCallNode getFunArg() {
        return funArg;
    }

    public boolean isFunctionCall() {
        return funArg != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FunctionArgNode that = (FunctionArgNode) o;

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
