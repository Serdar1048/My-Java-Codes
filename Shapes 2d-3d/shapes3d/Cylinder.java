package shapes3d;

import shapes2d.Circle;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height) {
        super(1);
        this.height = height;
    }

    public double area() {
        return 2 * super.area() + height * super.perimeter();
    }

    public double volume() {
        return super.area() * this.height;
    }

    @Override
    public String toString() {
        String temp = "height=" + this.height + "}";
        return super.toString().replace("Circle", "Cylinder").replace("}", temp);
    }
}
