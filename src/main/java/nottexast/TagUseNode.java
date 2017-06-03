package nottexast;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Tags are defined in grammar as: ,,tag1,tag
 */
@EqualsAndHashCode(callSuper = false)
@Getter
public class TagUseNode extends NottexNode {
    private List<NottexNode> children;
    private List<String> names;

    public TagUseNode(List<NottexNode> children, List<String> tagNames) {
        if (children == null)
            this.children = new ArrayList<>();
        else
            this.children = children;

        this.names = tagNames;
    }

    public TagUseNode(List<NottexNode> children, String... tagNames) {
        this(children, Arrays.asList(tagNames));
    }


    @Override
    public String prettyPrint(String indent) {
        String childrenString = children
                .stream()
                .map(ch -> ch.prettyPrint(indent + INDENT))
                .collect(Collectors.joining("\n"));
        return indent + "Tag: " + names + '{' +
                (!children.isEmpty() ? ("\n" + indent + childrenString) : "") +
                '}';
    }
}
