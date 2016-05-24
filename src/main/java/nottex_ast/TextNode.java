package nottex_ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextNode extends Node {

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


    @Override
    public String prettyPrint(int n) {
        return repeatString(" ", n) + "Text: " + paragraphs;
    }

}
