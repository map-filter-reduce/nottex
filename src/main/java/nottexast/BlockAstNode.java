package nottexast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BlockAstNode extends NottexAstNode {

    private List<NottexAstNode> children;

    public BlockAstNode() {
        this.children = new ArrayList<>();
    }

    public BlockAstNode(List<NottexAstNode> children) {
        this.children = children;
    }

    public void addChild(NottexAstNode node) {
        children.add(node);
    }

    /**
     * Constructor used in test classes
     */
    public BlockAstNode(NottexAstNode... children) {
        this.children = Arrays.asList(children);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlockAstNode blockNode = (BlockAstNode) o;

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


    public List<NottexAstNode> getChildren() {
        return children;
    }

}
