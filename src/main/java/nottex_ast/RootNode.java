package nottex_ast;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RootNode extends Node {

    private List<Node> children;

    public RootNode() {
        this.children = new ArrayList<>();
    }

    public void addChild(Node node) {
        children.add(node);
    }

    @Override
    public String prettyPrint(int n) {
        return children.stream().map(arg -> arg.prettyPrint(n + INDENT_SIZE)).collect(Collectors.joining(",\n"));
    }
}
