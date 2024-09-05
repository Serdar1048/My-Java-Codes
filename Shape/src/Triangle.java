
public class Triangle extends TwoDimensionalShape {
	public double high;
	public double side;
	
	public Triangle(double high, double side) {
		this.high = high;
		this.side = side;
	}

	@Override
	public double getArea() {
		return (high*side)/2;
	}

	
}
