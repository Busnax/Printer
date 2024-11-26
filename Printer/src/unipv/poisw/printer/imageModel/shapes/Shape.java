package unipv.poisw.printer.imageModel.shapes;

import unipv.poisw.printer.colorModel.ColorRGB;

public abstract class Shape implements Misurable, Comparable<Shape> {
    private final ColorRGB color;
    public Shape(ColorRGB color) {
        this.color = color;
    }
    // Getters
    public int getRed() {return color.getRed();}
    public int getGreen() {return color.getGreen();}
    public int getBlue() {return color.getBlue();}
    // Override
    @Override
    public abstract double calcArea();
    @Override
    public abstract double calcPerimeter();

    // Color Management
    public ColorRGB getColor(){
        return color;
    }
    public int TotalColor(Shape shape){
        return getRed() + getGreen() + getBlue();
    }
    // colorOfA * 100 / totalColor = percentage of Color for Shape
    public double getShapeRedPercent(Shape shape){
        int red = getRed();
        int totalColor = TotalColor(shape);
        return (double) (red * 100) / totalColor;
    }
    public double getShapeGreenPercent(Shape shape){
        int green = getGreen();
        int totalColor = TotalColor(shape);
        return (double) (green * 100) / totalColor;
    }
    public double getShapeBluePercent(Shape shape){
        int blue = getBlue();
        int totalColor = TotalColor(shape);
        return (double) (blue * 100) / totalColor;
    }

    // Comparator of shapes based on their color
    @Override
    public int compareTo(Shape shape) {
        return this.color.compareTo(shape.color);
    }

    // Express Shapes in a legible form
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getColor()+ " area = " + this.calcArea();
    }

}
