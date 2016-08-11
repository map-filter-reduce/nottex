package post_processing.text_structuring;

import post_processing.style_management.Style;
import post_processing.style_management.StyleType;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public class Text implements Textable {
    private final String content;
    private final Map<StyleType, Style> styles;


    public Text(String content, Map<StyleType, Style> styles) {
        Objects.requireNonNull(styles, "Styles == null");
        Objects.requireNonNull(content, "Paragraphs == null");
        this.styles = Collections.unmodifiableMap(styles);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Map<StyleType, Style> getStyles() {
        return styles;
    }

    @Override
    public boolean isLinefeed() {
        return false;
    }


    @Override
    public String toString() {
        return "Text{" +
                "content='" + content + '\'' +
                ", styles=" + styles +
                '}';
    }
}
