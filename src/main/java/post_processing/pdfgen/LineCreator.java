package post_processing.pdfgen;

import post_processing.text_structuring.Paragraph;

import java.util.ArrayList;
import java.util.List;

public class LineCreator {
    //TODO: correct value
    public static final Size MAX_LINE_LENGTH = Size.of(10);

    public static List<Line> createLines(List<Paragraph> paragraphs) {
        List<Line> lines = new ArrayList<>();

        for (Paragraph paragraph : paragraphs){
            List<Word> words = paragraph.getWords();

        //TODO: cut words that don't fit into one line

            for (int i = 0; i < words.size(); ) {
                Line line = new Line();
                while (line.hasEnoughSpace(words.get(i))){
                    if (words.get(i).getLength().isGreaterThan(line.getMaxLineLength())){
                        throw new AssertionError();
                    }
                    line.addWord(words.get(i));
                    i++;
                }
                lines.add(line);
            }
            lines.add(new Line());
        }
        return lines;
    }
}
