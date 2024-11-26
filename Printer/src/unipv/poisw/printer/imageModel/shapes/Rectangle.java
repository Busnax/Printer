package unipv.poisw.printer.imageModel.shapes;
import unipv.poisw.printer.colorModel.ColorRGB;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle (double width, double height, ColorRGB color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (width + height);
    }
}
