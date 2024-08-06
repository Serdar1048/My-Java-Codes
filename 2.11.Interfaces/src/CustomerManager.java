
public class CustomerManager {
//	Logger logger; // HAS-A Relationship - Dependency'nin ifadesi - Composition

	Logger[] loggers;

	public CustomerManager(Logger[] /*newLogger*/  loggers1 ) {// Dependency Injection
//		this.logger = newLogger;
		this.loggers = loggers1;
	}

	public void add(Customer customer) {
		System.out.println(customer.getFirstname() + " " + customer.getLastName() + " added to the database ");

		// loglama yapmak istiyoruz
//		this.logger.log();

		for (Logger logger : this.loggers) {
			logger.log();
		}
	}
}
