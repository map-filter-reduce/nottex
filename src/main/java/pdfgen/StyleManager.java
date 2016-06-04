package pdfgen;

import com.jcabi.w3c.ValidatorBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StyleManager {
    private static Map<String, String> styleClassMap = new HashMap<>();

    // Built-in tags:
    static {
        styleClassMap.put("h",
                "display:block;" +
                        "text-align:center;" +
                        "font-size:45px;" +
                        "font-weight:bold;"
        );

        styleClassMap.put("red",
                "color:red"
        );


        styleClassMap.put("blue",
                "color:blue"
        );


        styleClassMap.put("justify",
                "text-align:justify;" +
                        "display:block;" +
                        "text-justify:inter-word;"


        );

    }


    /**
     * Method for inserting new CSS style into the styleClassMap. Method checks before insertion that CSS is valid.
     * If CSS is not valid then it will be not inserted into the map.
     *
     * @param tagName - will be the class
     * @param style   - CSS
     */
    public static void addStyle(String tagName, String style) {
        String css = String.format(".%s {%s}", tagName, style);

        if (isValidCss(css))
            styleClassMap.put(tagName, style);
            //TODO: logging
        else System.err.println("Invalid CSS");
    }


    private static boolean isValidCss(String css) {
        try {
            return new ValidatorBuilder().css().validate(css).valid();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Method for getting all tags as CSS that can be inserted between style tags in XHTML.
     *
     * @return CSS as String
     */
    public static String getStyles() {
        StringBuilder sb = new StringBuilder();

        styleClassMap.keySet()
                .stream()
                .forEach(key -> sb
                        .append(" .")
                        .append(key)
                        .append("{")
                        .append(styleClassMap.get(key))
                        .append("}")
                );

        return sb.toString();
    }

}
