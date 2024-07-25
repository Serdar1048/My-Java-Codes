package drawing.version1;

import java.util.ArrayList;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Rectangle;

public class Drawing {
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<Square> squares = new ArrayList<>();
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    public double totalArea() {
        double totalArea = 0;

        for (Circle c : circles) {
            totalArea += c.area();
        }
        for (Square s : squares) {
            totalArea += s.area();
        }
        for (Rectangle r : rectangles) {
            totalArea += r.area();
        }
        return totalArea;

    }
    void addCircle(Circle c){
        this.circles.add(c);
    }
    void addSquare(Square s){
        this.squares.add(s);
    }
    void addRectangle(Rectangle r){
        this.rectangles.add(r);
    }

}
