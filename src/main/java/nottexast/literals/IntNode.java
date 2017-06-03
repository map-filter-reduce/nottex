package nottexast.literals;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = false)
@Getter
public class IntNode extends NumberNode {
    private final Integer value;

    public IntNode(Integer value) {
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
