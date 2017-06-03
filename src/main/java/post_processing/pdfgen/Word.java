package post_processing.pdfgen;

import post_processing.style_management.Style;

import java.util.Collection;

/**
 * Can represent either
 * 1. string without whitespaces
 * 2. one whitespace character.
 */
public class Word {
    private String content;
    private Size length;
    private Size height;
    private Collection<Style> styles;
    private boolean isWhitespace;

    public Word(String content, Size length, Size height, Collection<Style> styles) {
        this.content = content;
        this.styles = styles;
        this.length = length;
        this.height = height;
        // If Word is a whitespace character then length is always 1.
        this.isWhitespace = content.length() == 1 && Character.isWhitespace(content.charAt(0));
    }

    public Size getLength(){
        return length;
    }

    public Size getHeight(){
        return height;
    }

    public boolean isWhitespace() {
        return isWhitespace;
    }
}
