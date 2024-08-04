
public class Product {
	public String name;
	public String model;
	public int price;
	public int stockAmount;

	public Product() {// default constructor (initializing attributes)
		this("MacBook", "pro", 15000, 400); // this kullanımı 2
		// initializing attributes
//		this.name = "MacBook";
//		this.model = "Pro";
//		this.price = 15000;
//		this.stockAmount = 400;
	}

	public Product(String name, String model, int price, int stackAmount) {// parametreli
		// initializing attributes
		this.name = name;
		this.model = model;
		this.price = price;
		this.stockAmount = stackAmount;
	}

//	public Product(String name, int price) {
//		System.out.println("abc");
//
//	}
//
//	public Product(int price, String name) {
//		System.out.println("def");
//	}
}
