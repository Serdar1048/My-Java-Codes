package shapes2d;

public class TestShapes {

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c);
        System.out.println(c.getRadius());
        System.out.println(c.area());

        Square s = new Square(5);
        System.out.println(s);
        System.out.println(s.area());

           }
}