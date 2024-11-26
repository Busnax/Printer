package unipv.poisw.printer.exeptions;

public class CartridgeEmptyException extends Throwable {
    private final static String DEFAULT_MESSAGE = "Not enough ink! ";
    public CartridgeEmptyException() {
        super(DEFAULT_MESSAGE);
    }
}
