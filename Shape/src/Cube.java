
public class Cube extends ThreeDimensionalShape {
	double side;

	
	public Cube(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getVolume() {
		return side * side * side;
	}

	@Override
	public double getArea() {
		return 6 * (side * side);
	}

}
