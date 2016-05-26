package nottex_ast;

import java.util.Arrays;
import java.util.List;

public class TagUseNode extends NottexNode implements ChildrenBearable {

    // TODO: maybe should have List<NotteXNode> children instead of RootNode to simplify
    private final RootNode content;
    private List<String> names;

    public TagUseNode(NottexNode content, List<String> tagNames) {
        if (content == null || content instanceof RootNode)
            this.content = (RootNode) content;
        else
            throw new AssertionError();

        this.names = tagNames;
    }

    public List<String> getNames() {
        return names;
    }

    public TagUseNode(List<NottexNode> children, List<String> tagNames) {
        this.content = new RootNode(children);
        this.names = tagNames;
    }

    public TagUseNode(NottexNode content, String... tagNames) {
        if (content == null || content instanceof RootNode)
            this.content = (RootNode) content;
        else
            throw new AssertionError();

        this.names = Arrays.asList(tagNames);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagUseNode that = (TagUseNode) o;

        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        return names != null ? names.equals(that.names) : that.names == null;

    }

    @Override
    public int hashCode() {
        int result = content != null ? content.hashCode() : 0;
        result = 31 * result + (names != null ? names.hashCode() : 0);
        return result;
    }

    @Override
    public String prettyPrint(int n) {
        return repeatString(" ", n) + "Tag: " + names + '{' +
                (content != null ? ("\n" + repeatString(" ", n) + content.prettyPrint(n + INDENT_SIZE)) : "") +
                '}';
    }

    @Override
    public List<NottexNode> getChildren() {
        return content.getChildren();
    }

    @Override
    public boolean hasChildren() {
        return content.hasChildren();
    }
}
