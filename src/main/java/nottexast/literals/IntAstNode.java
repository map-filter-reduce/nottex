package nottexast.literals;

public class IntAstNode extends NumberAstNode {

    private final Integer value;

    public IntAstNode(Integer value) {
        if (value == null)
            throw new AssertionError();

        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntAstNode intNode = (IntAstNode) o;

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
