package nottex_ast;

public class FunctionArgNode extends Node {

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
    public String prettyPrint(int n) {
        return repeatString(" ", n) + "Arg: " + "\n" +
                (isFunctionCall() ?
                        funArg.prettyPrint(n + INDENT_SIZE) : stringArg.prettyPrint(n + INDENT_SIZE));
    }

}
