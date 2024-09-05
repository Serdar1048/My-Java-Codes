
public class Square extends TwoDimensionalShape{
	public double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}
	

}
