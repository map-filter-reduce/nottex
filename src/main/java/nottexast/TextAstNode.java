package nottexast;

public class TextAstNode extends NottexAstNode {
    private String content;


    public TextAstNode(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextAstNode that = (TextAstNode) o;

        return content != null ? content.equals(that.content) : that.content == null;

    }

    @Override
    public int hashCode() {
        return content != null ? content.hashCode() : 0;
    }

    @Override
    public String prettyPrint(String n) {
        return n + "Text: " + content;
    }

    @Override
    public String toString() {
        return "TextAstNode{" +
                "paragraphs=" + content +
                '}';
    }
}
