
public class StudentCreditManager extends BaseCreditManager {
	
//	***OVERRIDING***
	public double creditCalculate(double tutar) {
		return tutar * 1.15;
	}
}
