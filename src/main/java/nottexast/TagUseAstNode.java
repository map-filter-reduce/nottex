package nottexast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Tags are defined in grammar as: ,,tag1,tag
 */
public class TagUseAstNode extends NottexAstNode {

    private List<NottexAstNode> children;
    private List<String> names;

    public TagUseAstNode(List<NottexAstNode> children, List<String> tagNames) {
        if (children == null)
            this.children = new ArrayList<>();
        else
            this.children = children;

        this.names = tagNames;
    }

    public TagUseAstNode(List<NottexAstNode> children, String... tagNames) {
        this(children, Arrays.asList(tagNames));
    }

    public List<String> getNames() {
        return names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagUseAstNode that = (TagUseAstNode) o;

        if (children != null ? !children.equals(that.children) : that.children != null) return false;
        return names != null ? names.equals(that.names) : that.names == null;

    }

    @Override
    public int hashCode() {
        int result = children != null ? children.hashCode() : 0;
        result = 31 * result + (names != null ? names.hashCode() : 0);
        return result;
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


    public List<NottexAstNode> getChildren() {
        return children;
    }

}
