package nottexast.literals;

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

        return value.equals(intNode.value);

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


    public Integer getValue() {
        return value;
    }
}
