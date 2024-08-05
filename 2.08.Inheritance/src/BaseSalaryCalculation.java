
public class BaseSalaryCalculation {
	public int maas;
	public int oran;

	public BaseSalaryCalculation() {
		// parametereli construction varsa kodda default construction'ı da
		// tanımlamalıyız.
	}

	public BaseSalaryCalculation(int maas, int oran) {
		this.maas = maas;
		this.oran = oran;
	}

	public void salaryCalculation() {
		this.maas = (this.maas * this.oran / 20); // fix formül
		System.out.println(this.maas);
	}
}
