package nottex_ast;

public class FunctionArgNode extends Node {

    private final String stringArg;
    private final FunctionCallNode funArg;

    public FunctionArgNode(FunctionCallNode funArg) {
        this.funArg = funArg;
        this.stringArg = null;
    }

    public FunctionArgNode(String stringArg) {
        this.stringArg = stringArg;
        this.funArg = null;
    }


    public boolean isFunctionCall() {
        return funArg != null;
    }


    @Override
    public String prettyPrint(int n) {
        return repeatString(" ", n) + "Arg: " +
                (isFunctionCall() ?
                        "\n" + funArg.prettyPrint(n + 1) : stringArg);
    }

}
