package nottex_ast.literals;

public class StringNode extends LiteralNode {

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
    public String toString() {
        return "\"" + value + "\"";
    }
}


