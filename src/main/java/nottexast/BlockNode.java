package nottexast;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = false)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BlockNode extends NottexNode {
    private List<NottexNode> children = new ArrayList<>();

    /**
     * Constructor used in test classes
     */
    public BlockNode(NottexNode... children) {
        this.children = Arrays.asList(children);
    }

    public void addChild(NottexNode node) {
        children.add(node);
    }

    @Override
    public String prettyPrint(String indent) {
        return children
                .stream()
                .map(arg -> arg.prettyPrint(indent + INDENT))
                .collect(Collectors.joining(",\n"));
    }
}
