package nottex_ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextNode extends NottexNode {

    public List<String> paragraphs;

    public TextNode(String content) {
        this.paragraphs = new ArrayList<>();
        // Parse into paragraphs
        // TODO: "asd\n\nasdasdasdasd\n\n\n\n" should leave 2 empty paragraphs in the end
        this.paragraphs = Arrays.asList(content.split("\n\n"))
                .stream()
                .map(str -> str.replace("\n", ""))
                .collect(Collectors.toList());
    }

    public TextNode(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextNode textNode = (TextNode) o;

        return paragraphs != null ? paragraphs.equals(textNode.paragraphs) : textNode.paragraphs == null;

    }

    @Override
    public int hashCode() {
        return paragraphs != null ? paragraphs.hashCode() : 0;
    }

    @Override
    public String prettyPrint(String n) {
        return n + "Text: " + paragraphs;
    }

}
