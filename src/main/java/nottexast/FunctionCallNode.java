package nottexast;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = false)
@Getter
public class FunctionCallNode extends NottexNode {
    private final String name;
    private List<FunctionArgNode> arguments;

    public FunctionCallNode(String name) {
        this.name = name;
        this.arguments = new ArrayList<>();
    }

    public FunctionCallNode(String name, FunctionArgNode... arguments) {
        this.name = name;
        this.arguments = Arrays.asList(arguments);
    }

    public int getArgCount() {
        return arguments.size();
    }

    public void addArgument(FunctionArgNode arg) {
        arguments.add(arg);
    }

    @Override
    public String prettyPrint(String indent) {
        String args = arguments.stream().map(arg -> "\n" + arg.prettyPrint(indent + INDENT)).collect(Collectors.joining(","));
        return indent + String.format("Function: %s (%s)", name, args + "\n" + indent);
    }
}