package nottex_ast.literals;

public class IntNode extends NumberNode {

    private final Integer value;

    public IntNode(Integer value) {
        if (value == null)
            throw new AssertionError();

        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntNode intNode = (IntNode) o;

        return value != null ? value.equals(intNode.value) : intNode.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public String getStringValue() {
        return String.valueOf(value);
    }

    @Override
    public Number getNumberValue() {
        return value;
    }


    public Integer getValue() {
        return value;
    }
}
