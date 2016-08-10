package nottexast.literals;


public class StringAstNode extends LiteralAstNode {

    private final String value;

    public StringAstNode(String value) {
        this.value = value.replace("\\\\", "\\").replace("\\\"", "\"");
    }

    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringAstNode that = (StringAstNode) o;

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

    @Override
    public String getStringRepr() {
        return value;
    }
}


