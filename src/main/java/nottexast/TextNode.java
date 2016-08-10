package nottexast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextNode extends NottexNode {

    private List<String> paragraphs;

    public static void main(String[] args) {
        createTextNodes("abc\n\nabc").forEach(System.out::println);
    }


    public static List<TextNode> createTextNodes(String content) {
        //
        //System.out.println("red asldasdasda\n\n red".replaceAll("(?s)^((?!red).)*$","*"));
        //System.out.println("red asldasdasda\n\nkl\n\n red".replaceAll("\\n\\n","*"));
        //TODO
        //throw new UnsupportedOperationException();

        String replacedContent = content.replaceAll("\\n\\n", "*");
        List<String> tmp = new ArrayList<>();
        List<TextNode> result = new ArrayList<>();
        for (char c : replacedContent.toCharArray()) {
            if (c == '*') {
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
        // TODO: remove paragraphs field, 1 TextNode is 1 paragraph (or empty line)
        this.paragraphs = new ArrayList<>();
        // Parse into paragraphs
        // TODO: "asd\n\nasdasdasdasd\n\n\n\n" should leave 2 empty paragraphs in the end
        // TODO: bitinikerdus
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
