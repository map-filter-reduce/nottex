package grammar;

import java.util.Map;

public interface Textable {

    Map<StyleType, Style> getStyles();

    boolean isLinefeed();



}
