package nottex_ast;

public class StringNode extends Node {

    private final String value;

    public StringNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String prettyPrint(int n) {
        return repeatString(" ", n) + "String: " + "\"" + value + "\"";
    }
}
