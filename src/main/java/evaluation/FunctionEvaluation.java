package evaluation;

import nottexast.NottexNode;
import nottexast.literals.DoubleNode;
import nottexast.literals.IntNode;
import nottexast.literals.StringNode;
import pdfgen.StyleManager;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Class for holding NoTTeX built-in functions
 */
public class FunctionEvaluation {

    //
    // NB! All methods
    //      1) must be static
    //      2) must have a return type of NottexNode or its subclass
    //


    /**
     * Built-in method for defining custom tags.
     * <p>
     * Defined tag will be added into the system memory. Will overwrite tags with the same name (including pre-defined tags)
     * <p>
     * Example: ::def("cyan", "color:cyan;")
     * <p>
     * If CSS is invalid then tag will be not created, but the PDF will still be generated
     *
     * @param tagName  - name of the tag
     * @param styleCss - CSS 2.1
     * @return empty StringNode
     */
    public static NottexNode def(StringNode tagName, StringNode styleCss) {
        StyleManager.addStyle(tagName.getValue(), styleCss.getValue());
        return new StringNode("");
    }

    /**
     * Built-in method for doing arithmetic operations with integers.
     * <p>
     * Example: ::eval(4+1*(8+1)) will return 13
     *
     * @param expression - arithmetic operation
     * @return evaluated expression.
     */
    public static NottexNode eval(IntNode expression) {
        return expression;
    }

    /**
     * Built-in method for doing arithmetic operations with doubles.
     * <p>
     * Example: ::eval(4+1*(8+1)) will return 13
     *
     * @param expression - arithmetic operation
     * @return evaluated expression.
     */
    public static NottexNode eval(DoubleNode expression) {
        return expression;
    }

    /**
     * Built-in method for writing normally forbidden syntax to PDF
     * <p>
     * Example: ::escape("::eval(4+1)") will return ::eval(4+1)
     *
     * @param string - that will be converted to text
     * @return converted text
     */
    public static NottexNode escape(StringNode string) {
        return new StringNode(string.getValue());
    }


    /**
     * Built-in function for creating timestamp:
     * @return timestamp formatted as dd-MM-yyyy HH:mm
     */
    public static NottexNode timeStamp() {
        return new StringNode(new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new java.util.Date()));
    }

    // TEST FUNCTIONS


    public static NottexNode testUpperCase(StringNode string) {
        return new StringNode(string.getValue().toUpperCase());
    }

    public static NottexNode testAdd(IntNode number1, IntNode number2) {
        return new IntNode(
                number1.getNumberValue().intValue() +
                        number2.getNumberValue().intValue()
        );
    }

    public static NottexNode testRepeat(StringNode string, IntNode integer) {
        return new StringNode(Collections.nCopies(integer.getValue(), string.getValue())
                .stream()
                .collect(Collectors.joining()));
    }

    public static NottexNode testEmpty() {
        return new StringNode("TEST");
    }

}
