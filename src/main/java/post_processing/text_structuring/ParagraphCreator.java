package post_processing.text_structuring;

import java.util.*;
import java.util.stream.Collectors;

public class ParagraphCreator {


    public static List<Paragraph> createParagraphs(List<Text> textLst) {
        List<Textable> textables = new ArrayList<>();
        textLst.stream().map(ParagraphCreator::createTextNodes).forEach(textables::addAll);

        List<Text> temp = new ArrayList<>();
        List<Paragraph> out = new ArrayList<>();

        for (Textable textable : textables) {
            if (textable.isLinefeed()) {
                out.add(new Paragraph(temp));
                temp.clear();
            } else {
                temp.add((Text) textable);
            }
        }

        if (!temp.isEmpty()) {
            out.add(new Paragraph(temp));
        }
        return out;
    }


    private static List<Textable> createTextNodes(Text text) {
        String replacedContent = text.getContent().replaceAll("\\n\\n", "\u13E0"); // Assuming no Indians
        List<String> tmp = new ArrayList<>();
        List<Textable> result = new ArrayList<>();
        for (char c : replacedContent.toCharArray()) {
            if (c == '\u13E0') {
                if (!tmp.isEmpty()) {
                    result.add(new Text(tmp.stream().collect(Collectors.joining()), text.getStyles()));
                }
                result.add(new Linefeed(text.getStyles()));
                tmp.clear();
            } else {
                tmp.add(String.valueOf(c));
            }
        }

        if (!tmp.isEmpty()) {
            result.add(new Text(tmp.stream().collect(Collectors.joining()), text.getStyles()));
        }

        return result;
    }

}
