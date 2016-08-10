package evaluation;

import nottexast.NottexAstNode;
import nottexast.literals.DoubleAstNode;
import nottexast.literals.IntAstNode;
import nottexast.literals.StringAstNode;
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
    //      2) must have a return type of NottexAstNode or its subclass
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
     * @return empty StringAstNode
     */
    public static NottexAstNode def(StringAstNode tagName, StringAstNode styleCss) {
        StyleManager.addStyle(tagName.getValue(), styleCss.getValue());
        return new StringAstNode("");
    }

    /**
     * Built-in method for doing arithmetic operations with integers.
     * <p>
     * Example: ::eval(4+1*(8+1)) will return 13
     *
     * @param expression - arithmetic operation
     * @return evaluated expression.
     */
    public static NottexAstNode eval(IntAstNode expression) {
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
    public static NottexAstNode eval(DoubleAstNode expression) {
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
    public static NottexAstNode escape(StringAstNode string) {
        return new StringAstNode(string.getValue());
    }


    /**
     * Built-in function for creating timestamp:
     * @return timestamp formatted as dd-MM-yyyy HH:mm
     */
    public static NottexAstNode timeStamp() {
        return new StringAstNode(new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new java.util.Date()));
    }

    // TEST FUNCTIONS


    public static NottexAstNode testUpperCase(StringAstNode string) {
        return new StringAstNode(string.getValue().toUpperCase());
    }

    public static NottexAstNode testAdd(IntAstNode number1, IntAstNode number2) {
        return new IntAstNode(
                number1.getNumberValue().intValue() +
                        number2.getNumberValue().intValue()
        );
    }

    public static NottexAstNode testRepeat(StringAstNode string, IntAstNode integer) {
        return new StringAstNode(Collections.nCopies(integer.getValue(), string.getValue())
                .stream()
                .collect(Collectors.joining()));
    }

    public static NottexAstNode testEmpty() {
        return new StringAstNode("TEST");
    }

}
