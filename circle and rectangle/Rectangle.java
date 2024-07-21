public class Rectangle {

    Point topLeft;
    int sideA, sideB;

    public Rectangle(Point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Point[] corners() {
        Point[] points = new Point[4];
        points[0] = topLeft;
        points[1] = new Point(topLeft.xCoord + sideB, topLeft.yCoord);
        points[2] = new Point(topLeft.xCoord, topLeft.yCoord + sideA);
        points[3] = new Point(topLeft.xCoord + sideB, topLeft.yCoord + sideA);

        return points;
    }

    public double dioganal() {
        Point topLeftCorner = this.topLeft;
        Point bottomRightCorner = this.corners()[3];
        return topLeftCorner.distance(bottomRightCorner);
    }
    public int area() {
        return (topLeft.xCoord + sideB) * (topLeft.yCoord + sideA);
    }
    public int perimeter() {
        return 2 * ((topLeft.xCoord + sideB) + (topLeft.yCoord + sideA));
    }
}