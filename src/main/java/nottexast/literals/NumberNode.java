package nottexast.literals;

public abstract class NumberNode extends LiteralNode {

    /**
     * Method for getting NumberNode value as Double or Integer
     *
     * @return real value of the NumberNode
     */
    public abstract Number getNumberValue();

    /**
     * Method for converting numerical value in String to NumberNode
     *
     * @param numericalValue - numerical value as String
     * @return corresponding NumberNode
     */
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

    /**
     * Method for converting Number to NumberNode
     *
     * @param number that will be converted
     * @return corresponding NumberNode
     */
    public static NumberNode numberNode(Number number) {
        return NumberNode.numberNode(String.valueOf(number));
    }

}
