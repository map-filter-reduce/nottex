package nottex_ast;

import java.util.Arrays;
import java.util.List;

public class TagUseNode extends Node {

    private final Node content;
    private List<String> names;

    public TagUseNode(Node content, List<String> tagNames) {
        this.content = content;
        this.names = tagNames;
    }

    public TagUseNode(Node content, String... tagNames) {
        this.content = content;
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
}
