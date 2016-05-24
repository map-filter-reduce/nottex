package nottex_ast;

import java.util.List;

public class TagUseNode extends Node {

    private final Node content;
    private List<String> names;

    public TagUseNode(Node content, List<String> tagNames) {
        this.content = content;
        this.names = tagNames;
    }


    @Override
    public String prettyPrint(int n) {
        return repeatString(" ", n) + "Tag: " + names + '{' + "\n" +
                repeatString(" ", n) + content.prettyPrint(n + 1) + '}';
    }
}
