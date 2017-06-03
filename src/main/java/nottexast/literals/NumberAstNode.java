package nottexast.literals;

public abstract class NumberAstNode extends LiteralAstNode {

    /**
     * Method for getting NumberAstNode value as Double or Integer
     *
     * @return real value of the NumberAstNode
     */
    public abstract Number getNumberValue();

    /**
     * Method for converting numerical value in String to NumberAstNode
     *
     * @param numericalValue - numerical value as String
     * @return corresponding NumberAstNode
     */
    public static NumberAstNode numberNode(String numericalValue) {
        try {
            return new IntAstNode(Integer.parseInt(numericalValue));
        } catch (NumberFormatException e) {
            try {
                return new DoubleAstNode(Double.parseDouble(numericalValue));
            } catch (NumberFormatException e1) {
                throw new AssertionError();
            }
        }
    }

    /**
     * Method for converting Number to NumberAstNode
     *
     * @param number that will be converted
     * @return corresponding NumberAstNode
     */
    public static NumberAstNode numberNode(Number number) {
        return NumberAstNode.numberNode(String.valueOf(number));
    }

}
