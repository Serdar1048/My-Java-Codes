
public class Dog {
	private String name, breed;
	private int age;

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public boolean isEqualsDogs(Dog otherDog) {
		return this.name.equals(otherDog.name) && this.age == otherDog.age && this.breed.equals(otherDog.breed);
	}
}
