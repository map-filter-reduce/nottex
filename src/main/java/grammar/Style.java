package grammar;

public class Style {
    private String name;
    private StyleType styleType;

    public Style(String name) {
        this.name = name;
        this.styleType = StyleType.TYPE1;
        //TODO: styletypes
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
