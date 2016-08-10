package nottexast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextAstNode extends NottexAstNode {
    private List<String> paragraphs;
    private String content;

    public static List<TextAstNode> createTextNodes(String content) {
        // TODO: 10/08/2016 object ParagraphNode that contains only 1 paragraph, need to convert TextNodes -> ParagraphNodes at some point
        String replacedContent = content.replaceAll("\\n\\n", "\u13E0"); // Assuming no Indians
        List<String> tmp = new ArrayList<>();
        List<TextAstNode> result = new ArrayList<>();
        for (char c : replacedContent.toCharArray()) {
            if (c == '\u13E0') {
                result.add(new TextAstNode(tmp.stream().collect(Collectors.joining())));
                result.add(new TextAstNode("\n\n"));
                tmp.clear();
            } else {
                tmp.add(String.valueOf(c));
            }
        }

        if (!tmp.isEmpty()) {
            result.add(new TextAstNode(tmp.stream().collect(Collectors.joining())));
        }

        return result;
    }

    public TextAstNode(String content) {
        this.content = content; // TODO: 10/08/2016 check usages
        this.paragraphs = new ArrayList<>(); // TODO: 10/08/2016 check usages
        this.paragraphs = Arrays.asList(content.split("\n\n"))
                .stream()
                .map(str -> str.replace("\n", ""))
                .collect(Collectors.toList());
    }

    public TextAstNode(List<String> paragraphs) {
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

        TextAstNode textNode = (TextAstNode) o;

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
        return "TextAstNode{" +
                "paragraphs=" + paragraphs +
                '}';
    }
}
