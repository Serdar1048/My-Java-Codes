
package shapes2d;

public class Circle /*extends Object*/{
    protected double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius>0){
            this.radius = radius;
        }
    }
    public Circle(double radius){
        this.setRadius(radius);
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
    public double perimeter(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
