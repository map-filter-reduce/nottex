package nottex_ast;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallNode extends Node {

    private final String name;
    private List<FunctionArgNode> arguments;

    public FunctionCallNode(String name) {
        this.name = name;
        this.arguments = new ArrayList<>();
    }

    public void addArgument(FunctionArgNode arg) {
        arguments.add(arg);
    }


    @Override
    public String prettyPrint(int n) {
        String args = arguments.stream().map(arg -> "\n" + arg.prettyPrint(n + INDENT_SIZE)).collect(Collectors.joining(","));
        return repeatString(" ", n) + String.format("Function: %s (%s) ", name, args + "\n" + repeatString(" ", n));
    }


}
