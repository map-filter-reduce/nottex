package grammar;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.AbstractMap.SimpleEntry;

public class Style {
    private String name;
    private StyleType styleType;

    private static Map<String, StyleType> styleNameTypeMap;

    static {
        styleNameTypeMap = Collections.unmodifiableMap(Stream.of(
                new SimpleEntry<>("red", StyleType.TEXT_COLOR),
                new SimpleEntry<>("green", StyleType.TEXT_COLOR),
                new SimpleEntry<>("blue", StyleType.TEXT_COLOR),
                new SimpleEntry<>("arial", StyleType.FONT_FAMILY),
                new SimpleEntry<>("garamond", StyleType.FONT_FAMILY)
        ).collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue)));
    }

    public Style(String name) {
        this.name = name;
        this.styleType = styleNameTypeMap.get(name);
    }

    public StyleType getStyleType() {
        return styleType;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Style style = (Style) o;

        return name != null ? name.equals(style.name) : style.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
