public class Point {

    int xCoord, yCoord;

    public Point() {
    }

    public Point(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    public Point(int coord) {
        xCoord = coord;
        yCoord = coord;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((xCoord - p.xCoord), 2) + Math.pow((yCoord - p.yCoord), 2));
    }
}
