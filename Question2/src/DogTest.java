
/**
 * Create a Dog class with the following attributes: • The dog’s name • The
 * dog’s age • The dog’s breed Implement the class with accessors and mutators
 * for the dog’s name, age, and breed. Write a method equals that takes a Dog
 * object as an input parameter and returns true if the dog’s name, age, and
 * breed are the same as the input Dog object’s name, age, and breed. Otherwise,
 * the method should return false. Test the Dog class by creating two Dog
 * objects with the same name, age, and breed. Use the equals method to compare
 * the two Dog objects.
 */
public class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog("Boncuk", "Golden", 12);
		Dog d2 = new Dog("Boncuk", "Golden", 12);
		System.out.println(d1.isEqualsDogs(d2));

	}
}
