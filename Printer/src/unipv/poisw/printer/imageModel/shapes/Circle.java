package unipv.poisw.printer.imageModel.shapes;
import unipv.poisw.printer.colorModel.ColorRGB;

public class Circle extends Shape {
    private double radius;
    public Circle (double radius, ColorRGB color) {
        super(color);
        this.radius = radius;
    }
    public double getRadius () {return radius;}
    public void setRadius (double radius) {this.radius = radius;}
    public double calcArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
}
