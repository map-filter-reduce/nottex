package post_processing.pdfgen;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single line in the PDF document.
 * Can be empty.
 */
public class Line {
    private final Size maxLineLength;
    private List<Word> words;
    private Size remainingSpace;
    private Size height;


    public Line() {
        this(Size.of(210));
    }

    public Size getMaxLineLength() {
        return maxLineLength;
    }

    public Line(Size maxLineLength) {
        this.maxLineLength = Size.of(maxLineLength);
        this.remainingSpace = Size.of(maxLineLength);
        this.height = Size.of(0);
        this.words = new ArrayList<>();
    }

    public void addWord(Word word) throws LineOutOfSpaceException {
        if (hasEnoughSpace(word)) {
            words.add(word);
            remainingSpace.minus(word.getLength());
            if (word.getHeight().isGreaterThan(height)) {
                this.height = word.getHeight();
            }
        } else {
            throw new LineOutOfSpaceException();
        }
    }

    public Size getRemainingSpace() {
        return remainingSpace;
    }

    //TODO: implement
    public boolean hasEnoughSpace(Word word) {
        throw new UnsupportedOperationException();
    }


}
