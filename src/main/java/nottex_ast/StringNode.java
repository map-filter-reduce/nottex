package nottex_ast;

public class StringNode extends NottexNode {

    private final String value;

    public StringNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringNode that = (StringNode) o;

        return value != null ? value.equals(that.value) : that.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String prettyPrint(int n) {
        return repeatString(" ", n) + "String: " + "\"" + value + "\"";
    }
}


