
public class Sphere extends ThreeDimensionalShape{
	public double radius;
	
	public Sphere(double radius) {
		
		this.radius = radius;
	}

	@Override
	public double getVolume() {
		return (4/3)*(Math.PI)*(radius*radius*radius);
		
	}

	@Override
	public double getArea() {
		return 4*(Math.PI)*(radius*radius);
	}

}
