package unipv.poisw.printer.imageModel;

public interface Printable {
    final int MAX_COLOR_VALUE = 255;
    double inkNeeded();
    double getRedAmount();
    double getGreenAmount();
    double getBlueAmount();
}