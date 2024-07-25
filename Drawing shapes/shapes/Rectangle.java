package shapes;

public class Rectangle extends Shape {
    double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double area() {
        return sideA * sideB;
    }
}