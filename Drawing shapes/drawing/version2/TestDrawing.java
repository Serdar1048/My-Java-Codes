package drawing.version2;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class TestDrawing {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.addShape(new Circle(4));
        drawing.addShape(new Square(4));
        drawing.addShape(new Rectangle(3, 4));

        System.out.println("The total area is " + drawing.totalArea());
    }
}