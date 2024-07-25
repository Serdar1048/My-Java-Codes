package drawing.version2;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

import java.util.ArrayList;

public class Drawing {
    private ArrayList<Object> shapes = new ArrayList<>();

    public double totalArea() {
        double totalArea = 0;

        for (Object obj : shapes) {
            if (obj instanceof Circle) {
                totalArea += ((Circle) obj).area();
            }
            if (obj instanceof Square) {
                totalArea += ((Square) obj).area();
            }
            if (obj instanceof Rectangle) {
                Rectangle new_obj = (Rectangle) obj;
                totalArea += new_obj.area();
            }
        }
        return totalArea;
    }

    void addShape(Object object) {
        this.shapes.add(object);
    }

}
