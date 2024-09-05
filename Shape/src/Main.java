
public class Main {
	public static void main(String[] args) {

		Shape[] shapes = new Shape[] { new Cube(3), new Circle(2), new Square(3), new Triangle(1, 4),
				new Tetrahedron(2, 5), new Sphere(12) };

		for (Shape s : shapes) {
			if (s instanceof ThreeDimensionalShape) {
				System.out.println(s.getArea());
				System.out.println(s.getVolume());
			} else {
				System.out.println(s.getArea());
			}
		}

	}

}
