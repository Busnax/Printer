package unipv.poisw.printer;

import unipv.poisw.printer.colorModel.ColorRGB;
import unipv.poisw.printer.exeptions.CartridgeEmptyException;
import unipv.poisw.printer.exeptions.IllegalColorExeption;
import unipv.poisw.printer.exeptions.ShapesOutOfLimitExeption;
import unipv.poisw.printer.imageModel.RasterImage;
import unipv.poisw.printer.imageModel.VectorImage;
import unipv.poisw.printer.imageModel.shapes.Circle;
import unipv.poisw.printer.imageModel.shapes.Rectangle;
import unipv.poisw.printer.imageModel.shapes.Square;
import unipv.poisw.printer.inkJetPrinter.JetPrinter;

public class Main {
    public static void main(String[] args) throws IllegalColorExeption, ShapesOutOfLimitExeption, CartridgeEmptyException {
        ColorRGB color1 = new ColorRGB(100, 150, 30);
        ColorRGB color2 = new ColorRGB(255, 255, 255);
        ColorRGB color3 = new ColorRGB(70,200,140);
//        ColorRGB color4 = new ColorRGB(700,0,0);

        Circle circle = new Circle(1, color1);
        Square square = new Square(2, color2);
        Rectangle rectangle = new Rectangle( 1, 2, color3);
//        Circle circle1 = new Circle(4, color1);

        VectorImage vectorImage = new VectorImage();
        vectorImage.addShape(circle);
        vectorImage.addShape(square);
        vectorImage.addShape(rectangle);
//        vectorImage.addShape(circle1);

        JetPrinter jetPrinter = new JetPrinter();
        jetPrinter.showInkLevels();

        jetPrinter.printing(vectorImage);
        jetPrinter.showInkLevels();
        jetPrinter.refillCartridge("RED");
        jetPrinter.refillCartridge("GREEN");
        jetPrinter.refillCartridge("BLUE");
        jetPrinter.showInkLevels();

        RasterImage rasterImage = new RasterImage(5);
        jetPrinter.printing(rasterImage);
        jetPrinter.showInkLevels();
    }
}