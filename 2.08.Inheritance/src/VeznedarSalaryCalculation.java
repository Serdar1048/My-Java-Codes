
public class VeznedarSalaryCalculation extends BaseSalaryCalculation {
	public VeznedarSalaryCalculation() {
		super(1000, 100);
	}

	// overriding
	public void salaryCalculation() {
		this.maas = (this.maas * this.oran / 20 + 500);
		System.out.println("Cashier Salary: " + this.maas);
	}

}
