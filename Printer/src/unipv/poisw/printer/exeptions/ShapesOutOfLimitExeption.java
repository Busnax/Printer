package unipv.poisw.printer.exeptions;

public class ShapesOutOfLimitExeption extends Throwable {
    private final static String DEFAULT_MESSAGE = "Shapes out of limit";
    public ShapesOutOfLimitExeption() {
        super(DEFAULT_MESSAGE);
    }
}
