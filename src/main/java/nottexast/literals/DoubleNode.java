package nottexast.literals;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = false)
@Getter
public class DoubleNode extends NumberNode {
    private final Double value;

    public DoubleNode(Double value) {
        if (value == null)
            throw new AssertionError();
        this.value = value;
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
}
