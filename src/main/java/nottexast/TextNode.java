package nottexast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextNode extends NottexNode {
    private List<String> paragraphs;
    private String content;

    public static List<TextNode> createTextNodes(String content) {
        // TODO: 10/08/2016 object ParagraphNode that contains only 1 paragraph, need to convert TextNodes -> ParagraphNodes at some point
        String replacedContent = content.replaceAll("\\n\\n", "\u13E0"); // Assuming no Indians
        List<String> tmp = new ArrayList<>();
        List<TextNode> result = new ArrayList<>();
        for (char c : replacedContent.toCharArray()) {
            if (c == '\u13E0') {
                result.add(new TextNode(tmp.stream().collect(Collectors.joining())));
                result.add(new TextNode("\n\n"));
                tmp.clear();
            } else {
                tmp.add(String.valueOf(c));
            }
        }

        if (!tmp.isEmpty()) {
            result.add(new TextNode(tmp.stream().collect(Collectors.joining())));
        }

        return result;
    }

    public TextNode(String content) {
        this.content = content; // TODO: 10/08/2016 check usages
        this.paragraphs = new ArrayList<>(); // TODO: 10/08/2016 check usages
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

    public int getParagraphCount() {
        return paragraphs.size();
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

    @Override
    public String toString() {
        return "TextNode{" +
                "paragraphs=" + paragraphs +
                '}';
    }
}
