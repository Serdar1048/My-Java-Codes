
public class Product {
	// attributes
	private String id;
	public String brand;
	public String model;
	public int stockAmount;
	public String color;

	public Product(String brand, String modelString, int stockAmount, String color) {// id'ye burdan da erişebilirdik.
		this.brand = brand;
		this.model = modelString;
		this.stockAmount = stockAmount;
		this.color = color;
	}

	public void setId(String id) {
//		this.id = id;
		this.id = id.substring(0, 1) + id.substring(5, 6) + id.substring(9, 10) + id.substring(17, 18);// baş harfleri																										// aldık.
	}

	public String getId() {
		return id;
	}
}
