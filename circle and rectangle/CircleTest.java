public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5, new Point(3, 4));
        Circle circle2 = new Circle(5, new Point(10, 25));

        System.out.println("The radius of circle is " + circle1.radius);

        System.out.println("The area of the circle is " + circle1.area());
        System.out.println("The perimeter of the circle is " + circle1.perimeter());

        System.out.println("These two circles are intersect " + circle1.intersect(circle2));

    }
}
