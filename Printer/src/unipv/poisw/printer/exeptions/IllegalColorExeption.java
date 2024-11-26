package unipv.poisw.printer.exeptions;

public class IllegalColorExeption extends Throwable {
    private final static String DEFAULT_MESSAGE = "Invalid color Value!";
    public IllegalColorExeption() {
        super(DEFAULT_MESSAGE);
    }
}
