public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(0), 3, 4);
        System.out.println("The topleft of the rectangle is " + rectangle.topLeft.xCoord + " " + rectangle.topLeft.yCoord);
        System.out.println("The sideA of the rectangle is " + rectangle.sideA);
        System.out.println("The sideB of the rectangle is " + rectangle.sideB);
        System.out.println("The area of the rectangle is " + rectangle.area());
        System.out.println("The perimeter of the rectangle is " + rectangle.perimeter());
        System.out.println("The length of the dioganal is " + rectangle.dioganal());

        Point[] all_corners = rectangle.corners();
        for (int i = 0; i < all_corners.length; i++) {
            System.out.println("The point is " + all_corners[i].xCoord + " " + all_corners[i].yCoord);
        }

    }
}
