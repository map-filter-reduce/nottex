package nottex_ast;

public class FunctionArgNode extends NottexNode {

    private final StringNode stringArg;
    private final FunctionCallNode funArg;

    public FunctionArgNode(FunctionCallNode funArg) {
        this.funArg = funArg;
        this.stringArg = null;
    }

    public FunctionArgNode(StringNode stringArg) {
        this.stringArg = stringArg;
        this.funArg = null;
    }


    public boolean isFunctionCall() {
        return funArg != null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FunctionArgNode that = (FunctionArgNode) o;

        if (stringArg != null ? !stringArg.equals(that.stringArg) : that.stringArg != null) return false;
        return funArg != null ? funArg.equals(that.funArg) : that.funArg == null;

    }

    @Override
    public int hashCode() {
        int result = stringArg != null ? stringArg.hashCode() : 0;
        result = 31 * result + (funArg != null ? funArg.hashCode() : 0);
        return result;
    }

    @Override
    public String prettyPrint(int n) {
        return repeatString(" ", n) + "Arg: " + "\n" +
                (isFunctionCall() ?
                        funArg.prettyPrint(n + INDENT_SIZE) : stringArg.prettyPrint(n + INDENT_SIZE));
    }

}
