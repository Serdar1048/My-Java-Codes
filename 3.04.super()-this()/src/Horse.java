
public class Horse extends Animal {

	Horse() {
		this(4);
		System.out.println("2");
	}

	Horse(int a) {
		// super(); bu(ilk) satırda super() ya da this() olmak zorunda yoksa Java kendisi koyuyor.
 		System.out.println(a);
	}

	public static void main(String[] args) {
		new Horse(6);
	}
}
