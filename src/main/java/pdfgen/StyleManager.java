package pdfgen;

import com.jcabi.w3c.ValidatorBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StyleManager {
    private static Map<String, String> styleClassMap = new HashMap<>();


    public static void addStyle(String tagName, String style) {
        if (isValidCss(style))
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
