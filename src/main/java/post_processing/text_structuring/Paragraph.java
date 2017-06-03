package post_processing.text_structuring;

import post_processing.pdfgen.Measurer;
import post_processing.pdfgen.Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a paragraph in the PDF document.
 */
public class Paragraph {
    private final List<Text> texts;

    public Paragraph(List<Text> texts) {
        this.texts = Collections.unmodifiableList(new ArrayList<>(texts));
    }


    public List<Word> getWords() {
        List<Word> out = new ArrayList<>();
        texts.stream()
                .map(Measurer::createWords)
                .forEach(out::addAll);
        return out;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "texts=" + texts +
                '}';
    }
}
