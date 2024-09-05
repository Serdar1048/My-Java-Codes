
public class Circle extends TwoDimensionalShape{
	public double radius;
	public Circle(double radius) {
		this.radius= radius;
	}
	@Override
	public double getArea() {
		return 2*(Math.PI)*(radius*radius);
	}
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
}