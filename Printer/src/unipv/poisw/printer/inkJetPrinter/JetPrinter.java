package unipv.poisw.printer.inkJetPrinter;
import unipv.poisw.printer.exeptions.CartridgeEmptyException;
import unipv.poisw.printer.imageModel.Printable;

public class JetPrinter {
    private final InkCartridge redCartridge, blueCartridge, greenCartridge;
    // Constructor
    public JetPrinter() {
        redCartridge = new InkCartridge();
        blueCartridge = new InkCartridge();
        greenCartridge = new InkCartridge();
    }
    // Shows ink levels
    public void showInkLevels() {
        System.out.println("Red: " + redCartridge.getInkLevel() + " %");
        System.out.println("Green: " + greenCartridge.getInkLevel() + " %");
        System.out.println("Blue: " + blueCartridge.getInkLevel() + " %");
    }
    // Recharges cartridges
    public void refillCartridge(String color) {
        switch (color.toLowerCase()) {
            case "red":
                redCartridge.refill();
                break;
            case "blue":
                blueCartridge.refill();
                break;
            case "green":
                greenCartridge.refill();
                break;
            default:
                System.out.println("Invalid color");
        }
    }
    public void printing(Printable itemToPrint) throws CartridgeEmptyException {
        System.out.println("Printing " + itemToPrint.toString() + " ... ");
        if(redCartridge.getInkLevel() < itemToPrint.getRedAmount() || blueCartridge.getInkLevel() < itemToPrint.getGreenAmount() || greenCartridge.getInkLevel() < 0) {
            throw new CartridgeEmptyException();
        }else{
            redCartridge.useInk(itemToPrint.getRedAmount());
            greenCartridge.useInk(itemToPrint.getGreenAmount());
            blueCartridge.useInk(itemToPrint.getBlueAmount());
        }
        System.out.println("Printing completed!");
    }
}