package grammar;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Text {
    private final List<String> paragraphs;
    private final Map<StyleType, Style> styles;


    public Text(List<String> paragraphs, Map<StyleType, Style> styles) {
        Objects.requireNonNull(styles, "Styles == null");
        Objects.requireNonNull(paragraphs, "Paragraphs == null");
        this.styles = Collections.unmodifiableMap(styles);
        this.paragraphs = Collections.unmodifiableList(paragraphs);
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

    public Map<StyleType, Style> getStyles() {
        return styles;
    }
}
