package post_processing.text_structuring;

import post_processing.style_management.Style;
import post_processing.style_management.StyleType;

import java.util.Map;

public interface Textable {

    Map<StyleType, Style> getStyles();

    boolean isLinefeed();



}
