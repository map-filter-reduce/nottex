package nottex_ast;

public abstract class NottexNode {

    protected final String INDENT = "    ";

    public abstract boolean equals(Object o);

    public abstract int hashCode();

    abstract String prettyPrint(String indent);

    public String prettyPrint() {
        return prettyPrint("");
    }

}
