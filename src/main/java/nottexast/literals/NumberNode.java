package nottexast.literals;

public abstract class NumberNode extends LiteralNode {

    public abstract Number getNumberValue();

    public static NumberNode numberNode(String numericalValue) {
        try {
            return new IntNode(Integer.parseInt(numericalValue));
        } catch (NumberFormatException e) {
            try {
                return new DoubleNode(Double.parseDouble(numericalValue));
            } catch (NumberFormatException e1) {
                throw new AssertionError();
            }
        }
    }

    public static NumberNode numberNode(Number number) {
        return NumberNode.numberNode(String.valueOf(number));
    }

}
