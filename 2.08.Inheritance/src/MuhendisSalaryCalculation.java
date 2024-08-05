
public class MuhendisSalaryCalculation extends BaseSalaryCalculation {
	public MuhendisSalaryCalculation() {
		super(1000, 200); // super ile BaseSalaryCalculation sınıfının constructor'ına gidiyoruz.
	}
	
	// overriding
	public void salaryCalculation() {
		this.maas = (this.maas * this.oran / 20);
		System.out.println("Engineer Salary: " + this.maas);
	}
}
