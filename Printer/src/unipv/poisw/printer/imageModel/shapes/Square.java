package unipv.poisw.printer.imageModel.shapes;
import unipv.poisw.printer.colorModel.ColorRGB;

public class Square extends Shape {
    private double side;
    public Square(double side, ColorRGB color) {
        super(color);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double calcArea() {
        return Math.pow(side, 2);
    }
    @Override
    public double calcPerimeter() {
        return side * 4;
    }
}
