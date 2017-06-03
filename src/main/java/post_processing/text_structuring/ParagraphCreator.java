package post_processing.text_structuring;

import post_processing.style_management.Style;
import post_processing.style_management.StyleType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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
        String replacedContent = text.getContent()
                .replaceAll("\\n\\n", "\u13E0") // Assuming no Indians
                .replaceAll("\\n"," ");
        List<String> tmp = new ArrayList<>();
        List<Textable> result = new ArrayList<>();
        for (char c : replacedContent.toCharArray()) {
            if (c == '\u13E0') {
                if (!tmp.isEmpty()) {
                    result.add(new Text(String.join("", tmp), text.getStyles()));
                }
                result.add(new Linefeed(text.getStyles()));
                tmp.clear();
            } else {
                tmp.add(String.valueOf(c));
            }
        }

        if (!tmp.isEmpty()) {
            result.add(new Text(String.join("", tmp), text.getStyles()));
        }

        return result;
    }

    private static class Linefeed implements Textable {
        private Map<StyleType, Style> styleMap;

        public Linefeed(Map<StyleType, Style> styles) {
            styleMap = Collections.unmodifiableMap(styles);

        }

        @Override
        public Map<StyleType, Style> getStyles() {
            return styleMap;
        }

        @Override
        public boolean isLinefeed() {
            return true;
        }
    }
}
