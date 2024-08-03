
public class Car {
	public String brand;
	public String color;
	public String model;
	public int speed;
	public int price;

	public void speedUp(int increment) {
		this.speed = this.speed + increment;
	}

	public void applyBrakes(int dicrement) {
		this.speed = this.speed - dicrement;
	}

	public void printStates() {
		System.out.println(
				"brand: " + this.brand + " color: " + this.color + " model: " + this.model + " price: " + this.price);
	}
}
