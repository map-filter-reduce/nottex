package nottex_ast;

public class DoubleNode extends NumberNode {

    private final Double value;

    public DoubleNode(Double value) {
        if (value == null)
            throw new AssertionError();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoubleNode that = (DoubleNode) o;

        return value != null ? value.equals(that.value) : that.value == null;
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
    public Number getValue() {
        return value;
    }
}
