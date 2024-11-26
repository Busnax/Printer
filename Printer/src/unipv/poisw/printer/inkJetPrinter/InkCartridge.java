package unipv.poisw.printer.inkJetPrinter;

public class InkCartridge {
    private double inkLevel;
    // Constructor initiate level at 100%
    public InkCartridge() {this.inkLevel = 100.0;}
    // The level cant go under 0%
    public void useInk(double amount) {
        inkLevel -= amount;
        if (inkLevel < 0) inkLevel = 0;
    }
    // Resets cartage value to 100%
    public void refill() {inkLevel = 100.0;}
    // Gives current level
    public double getInkLevel() {return inkLevel;}
}

