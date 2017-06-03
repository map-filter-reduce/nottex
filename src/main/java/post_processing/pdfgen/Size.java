package post_processing.pdfgen;

/**
 * Should be useful. Remains to be seen...
 */
public class Size implements Comparable<Size> {

    public Size() {
    }

    //TODO: implement
    public static Size of(int i) {
        throw new UnsupportedOperationException();
    }

    //TODO: implement
    public static Size of(Size size) {
        throw new UnsupportedOperationException();
    }

    //TODO: implement
    public void minus(Size size) {
        throw new UnsupportedOperationException();
    }

    public boolean isGreaterThan(Size size) {
        return this.compareTo(size) > 0;
    }

    //TODO: implement
    @Override
    public int compareTo(Size o) {
        throw new UnsupportedOperationException();
    }

}
