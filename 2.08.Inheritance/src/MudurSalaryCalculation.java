
public class MudurSalaryCalculation extends BaseSalaryCalculation {
	public MudurSalaryCalculation() {
		super(1000, 300);
	}

	// overriding
	public void salaryCalculation() {
		this.maas = (this.maas * this.oran / 20);
		System.out.println("Manager Salary: " + this.maas);
	}
}  
