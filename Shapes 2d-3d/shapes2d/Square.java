package shapes2d;

public class Square {

    protected double side;
    public Square(double side) {
        this.side = side;
    }
    public double area() {
        return this.side * this.side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}