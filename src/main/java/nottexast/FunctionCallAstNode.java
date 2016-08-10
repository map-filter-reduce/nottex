package nottexast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallAstNode extends NottexAstNode {

    private final String name;
    private List<FunctionArgAstNode> arguments;

    public FunctionCallAstNode(String name) {
        this.name = name;
        this.arguments = new ArrayList<>();
    }

    public FunctionCallAstNode(String name, FunctionArgAstNode... arguments) {
        this.name = name;
        this.arguments = Arrays.asList(arguments);
    }

    public String getName() {
        return name;
    }

    public int getArgCount() {
        return arguments.size();
    }

    public void addArgument(FunctionArgAstNode arg) {
        arguments.add(arg);
    }

    public List<FunctionArgAstNode> getArguments() {
        return arguments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FunctionCallAstNode that = (FunctionCallAstNode) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return arguments != null ? arguments.equals(that.arguments) : that.arguments == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (arguments != null ? arguments.hashCode() : 0);
        return result;
    }

    @Override
    public String prettyPrint(String indent) {
        String args = arguments.stream().map(arg -> "\n" + arg.prettyPrint(indent + INDENT)).collect(Collectors.joining(","));
        return indent + String.format("Function: %s (%s)", name, args + "\n" + indent);
    }


}
