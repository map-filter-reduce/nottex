package grammar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paragraph {
    private List<Text> texts;

    public Paragraph(List<Text> texts) {
        this.texts = Collections.unmodifiableList(new ArrayList<>(texts));
    }


    @Override
    public String toString() {
        return "Paragraph{" +
                "texts=" + texts +
                '}';
    }
}
