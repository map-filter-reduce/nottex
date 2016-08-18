package post_processing.pdfgen;

import post_processing.style_management.Style;
import post_processing.text_structuring.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Measurer {

    /**
     * Splits {@link Text} into {@link Word}s.
     * @param text
     * @return
     */
    public static List<Word> createWords(Text text) {
        List<Word> words = new ArrayList<>();
        String content = text.getContent();
        Collection<Style> styles = text.getStyles().values();

        Pattern pattern = Pattern.compile("([^\\r\\t ]+)|([\\r\\t ])");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            String match = matcher.group();
            //words.add(new Word(match,styles));
        }
        return words;
    }

    //TODO: implement methods
    private static Size measureLength(String wordContent, Collection<Style> styles){
        throw new UnsupportedOperationException();
    }

    private static Size measureHeight(String wordContent, Collection<Style> styles){
        throw new UnsupportedOperationException();
    }
}
