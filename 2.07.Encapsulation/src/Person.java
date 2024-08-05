
public class Person {
	// attributes
	public String firstName;
	public String lastName;
	public int age;

	private String email;

	public String getEmail() {
		return email;// değer döndürüyor.
	}

	public void setEmail(String email) {
//		this.email = email;//değer atıyor.
		if (email.contains("@")) {
			this.email = email;
		} else {
			this.email = "Invalid email";
		}
	}
}