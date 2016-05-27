package evaluation;

import nottex_ast.NottexNode;
import nottex_ast.literals.IntNode;
import nottex_ast.literals.StringNode;

import java.util.Collections;
import java.util.stream.Collectors;

public class FunctionEvaluation {

    //
    // NB! All methods
    //      1) must be static
    //      2) must have a return type of NottexNode or its subclass
    //

    public static NottexNode upperCase(StringNode string) {
        return new StringNode(string.getValue().toUpperCase());
    }

    public static NottexNode add(IntNode number1, IntNode number2) {
            return new IntNode(
                    number1.getNumberValue().intValue() +
                    number2.getNumberValue().intValue()
            );
    }

    public static NottexNode repeat(StringNode string, IntNode integer){
        return new StringNode(Collections.nCopies(integer.getValue(), string.getValue())
                .stream()
                .collect(Collectors.joining()));
    }

}
