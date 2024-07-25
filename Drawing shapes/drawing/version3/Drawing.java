package drawing.version3;

import shapes.Shape;


import java.util.ArrayList;

public class Drawing {

    private ArrayList<Shape> shapes = new ArrayList<>();


    public double totalArea() {
        double totalArea = 0;

        for (Shape shape:shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }

    void addShape(Shape shape){
        this.shapes.add(shape);
    }

}
