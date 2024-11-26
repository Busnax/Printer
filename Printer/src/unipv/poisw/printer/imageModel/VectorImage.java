package unipv.poisw.printer.imageModel;
import unipv.poisw.printer.exeptions.ShapesOutOfLimitExeption;
import unipv.poisw.printer.imageModel.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class VectorImage implements Printable {
    private final List<Shape> shapes;
    double CONSUMPTION = 0.1;

    public VectorImage() {
        this.shapes = new ArrayList<Shape>();
    }
    public void addShape(Shape shape) throws ShapesOutOfLimitExeption {
        int MAXDIM = 3;
        if ((shapes.size() + 1) > MAXDIM){
            throw new ShapesOutOfLimitExeption();
        }else{
            shapes.add(shape);
        }
    }
    public double calcTotalArea(){
        double totalArea = 0;
        for (Shape shape : this.shapes) {
            totalArea += shape.calcArea();
        }
        return totalArea;
    }
    @Override
    public double inkNeeded() {
        return calcTotalArea() * CONSUMPTION;
    }
    // colorPercent = shapeArea * shapeColor / TotalArea
    public double getRedPercent() {
        double redPercent = 0;
        for (Shape shape : this.shapes) {
            redPercent += (shape.calcArea() * shape.getShapeRedPercent(shape)) / calcTotalArea();
        }
        return redPercent;
    }
    public double getGreenPercent() {
        double greenPercent = 0;
        for (Shape shape : this.shapes) {
            greenPercent += (shape.calcArea() * shape.getShapeGreenPercent(shape)) / calcTotalArea();
        }
        return greenPercent;
    }
    public double getBluePercent() {
        double bluePercent = 0;
        for (Shape shape : this.shapes) {
            bluePercent += (shape.calcArea() * shape.getShapeBluePercent(shape)) / calcTotalArea();
        }
        return bluePercent;
    }
    @Override
    public double getRedAmount() {
        return getRedPercent() * calcTotalArea() * CONSUMPTION;
    }
    @Override
    public double getGreenAmount() {
        return getGreenPercent() * calcTotalArea() * CONSUMPTION;
    }
    @Override
    public double getBlueAmount() {
        return getBluePercent() * calcTotalArea() * CONSUMPTION;
    }
    @Override
    public String toString() {
        return "VectorImage [shapes=" + this.shapes + "]";
    }
}