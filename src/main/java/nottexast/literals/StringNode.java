package nottexast.literals;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = false)
@Getter
public class StringNode extends LiteralNode {
    private final String value;

    public StringNode(String value) {
        this.value = value.replace("\\\\", "\\").replace("\\\"", "\"");
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


