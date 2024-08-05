
public class ProductManager {// ürünü yönetir.
	
	public ProductManager() {
		System.out.println("123"); //constructor 
	}

	public void add(Product product) {// object referer. Ürünü refer eden object referer parametre olarak alındı.
		// JDBC
		System.out.println("Product added to database");

		product.setId("BeatsSoloWireless1"); // bu class setId metotunda neler olduğunu bilemez sadece oraya değer
												// atar.(encapsulation)
		System.out.println("product's id: " + product.getId());

	}
}
