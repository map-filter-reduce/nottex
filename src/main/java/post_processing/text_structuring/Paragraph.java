package post_processing.text_structuring;

import post_processing.pdfgen.Measurer;
import post_processing.pdfgen.Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paragraph {
    private List<Text> texts;

    public Paragraph(List<Text> texts) {
        this.texts = Collections.unmodifiableList(new ArrayList<>(texts));
    }


    public List<Word> getWords() {
        List<Word> out = new ArrayList<>();
        texts.stream().map(text -> Measurer.createWords(text.getContent(), text.getStyles())).forEach(out::addAll);
        return out;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "texts=" + texts +
                '}';
    }
}
