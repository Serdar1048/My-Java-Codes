
public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Harry", 400, "Rowling", "abc0");
//		b1.numberOfPage = 400;
//		System.out.println(b1.numberOfPage);
		b1.setNumberOfPage(-700);
		System.out.println(b1.getNumberOfPage());
		
		
	}

}
