package evaluation;

import nottex_ast.NottexNode;
import nottex_ast.literals.DoubleNode;
import nottex_ast.literals.IntNode;
import nottex_ast.literals.StringNode;
import pdfgen.StyleManager;

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


    public static NottexNode def(StringNode tagName, StringNode styleCss) {
        StyleManager.addStyle(tagName.getValue(), styleCss.getValue());
        return new StringNode("");
    }

    public static NottexNode eval(IntNode expression) {
        return expression;
    }

    public static NottexNode eval(DoubleNode expression) {
        return expression;
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
