package grammar;

import java.util.Collections;
import java.util.Map;

public class Linefeed implements Textable {
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
