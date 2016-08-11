package post_processing.pdfgen;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private final Unit maxLineLength;
    private List<Word> words;
    private Unit remainingSpace;
    private Unit height;


    public Line(Unit maxLineLength) {
        this.maxLineLength = Unit.of(maxLineLength);
        this.remainingSpace = Unit.of(maxLineLength);
        this.height = Unit.of(0);
        this.words = new ArrayList<>();
    }

    public void addWord(Word word) throws LineOutOfSpaceException {
        if (hasEnoughSpace(word)) {
            words.add(word);
            remainingSpace.minus(word.getLength());
            if (word.getHeight().isGreater(height)) {
                this.height = word.getHeight();
            }
        } else {
            throw new LineOutOfSpaceException();
        }
    }

    public Unit getRemainingSpace() {
        return remainingSpace;
    }

    //TODO: implement
    private boolean hasEnoughSpace(Word word) {
        throw new UnsupportedOperationException();
    }


}
