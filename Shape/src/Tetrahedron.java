
public class Tetrahedron extends ThreeDimensionalShape {

	public double height;
	public double baseArea;
	public double side;

	public Tetrahedron(double height, double baseArea) {
		super();
		this.height = height;
		this.baseArea = baseArea;
	}

	@Override
	public double getVolume() {
		return (1.0 / 3.0) * baseArea * height;
	}

	@Override
	public double getArea() {
		return 2 * height * side;
	}

}
