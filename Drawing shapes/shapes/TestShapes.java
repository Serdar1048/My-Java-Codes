package shapes;


public class TestShapes {
    public static void main(String[] args) {
        Square sq = new Square(4);
        Circle c = new Circle(4);
        Rectangle rc = new Rectangle(3, 4);
        System.out.println(sq.area());
        System.out.println(rc.area());
        System.out.println(c.area());
    }
}
