package nottex_ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO: Refactor to BlockNode or something
public class BlockNode extends NottexNode implements ChildrenBearable {

    private List<NottexNode> children;

    public BlockNode() {
        this.children = new ArrayList<>();
    }

    public BlockNode(List<NottexNode> children) {
        this.children = children;
    }

    public void addChild(NottexNode node) {
        children.add(node);
    }

    public BlockNode(NottexNode... children) {
        this.children = Arrays.asList(children);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlockNode blockNode = (BlockNode) o;

        return children != null ? children.equals(blockNode.children) : blockNode.children == null;

    }

    @Override
    public int hashCode() {
        return children != null ? children.hashCode() : 0;
    }

    @Override
    public String prettyPrint(String indent) {
        return children
                .stream()
                .map(arg -> arg.prettyPrint(indent + INDENT))
                .collect(Collectors.joining(",\n"));
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
