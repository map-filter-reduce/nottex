package nottexast;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = false)
@Getter
public class TextNode extends NottexNode {
    private List<String> paragraphs;

    public TextNode(String content) {
        this.paragraphs = new ArrayList<>();
        // Parse into paragraphs
        // TODO: "asd\n\nasdasdasdasd\n\n\n\n" should leave 2 empty paragraphs in the end
        // TODO: bitinikerdus
        this.paragraphs = Arrays.stream(content.split("\n\n"))
                .map(str -> str.replace("\n", ""))
                .collect(Collectors.toList());
    }

    public TextNode(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public int getParagraphCount() {
        return paragraphs.size();
    }

    @Override
    public String prettyPrint(String n) {
        return n + "Text: " + paragraphs;
    }

}
