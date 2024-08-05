
public class Main {

	public static void main(String[] args) {
		Product product = new Product("Beats", "Solo", 200, "black");
		
		System.out.println("product's brand: " + product.brand + " product's model: " + product.model
				+ " prodoct's stockamount: " + product.stockAmount + " product's color: " + product.color);
		
		ProductManager productManager = new ProductManager(); 
		productManager.add(product);
	}
}