package nottexast.literals;

public class DoubleAstNode extends NumberAstNode {

    private final Double value;

    public DoubleAstNode(Double value) {
        if (value == null)
            throw new AssertionError();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoubleAstNode that = (DoubleAstNode) o;

        return value.equals(that.value);

    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public String getStringRepr() {
        return String.valueOf(value);
    }

    @Override
    public Number getNumberValue() {
        return value;
    }

    public Double getValue() {
        return value;
    }
}
