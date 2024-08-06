
public class Customer {
	// attributes
	private int id, customerNumber, age;
	private String firstname, lastName;

	public Customer(int id, int customerNumber, String firstName, String lastName, int age) {// parametrised constructor
		this.id = id;
		this.customerNumber = customerNumber;
		this.firstname = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
