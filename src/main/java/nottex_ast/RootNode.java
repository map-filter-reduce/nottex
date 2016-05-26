package nottex_ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO: Refactor to BlockNode or something
public class RootNode extends NottexNode implements ChildrenBearable {

    private List<NottexNode> children;

    public RootNode() {
        this.children = new ArrayList<>();
    }

    public RootNode(List<NottexNode> children) {
        this.children = children;
    }

    public void addChild(NottexNode node) {
        children.add(node);
    }

    public RootNode(NottexNode... children) {
        this.children = Arrays.asList(children);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RootNode rootNode = (RootNode) o;

        return children != null ? children.equals(rootNode.children) : rootNode.children == null;

    }

    @Override
    public int hashCode() {
        return children != null ? children.hashCode() : 0;
    }

    @Override
    public String prettyPrint(int n) {
        return children.stream().map(arg -> arg.prettyPrint(n + INDENT_SIZE)).collect(Collectors.joining(",\n"));
    }

    @Override
    public List<NottexNode> getChildren() {
        return children;
    }

    @Override
    public boolean hasChildren() {
        return !children.isEmpty();
    }
}
