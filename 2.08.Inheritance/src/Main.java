
public class Main {

	public static void main(String[] args) {
		MuhendisSalaryCalculation muhendisSalaryCalculation = new MuhendisSalaryCalculation();
		muhendisSalaryCalculation.salaryCalculation();

		MudurSalaryCalculation mudurSalaryCalculation = new MudurSalaryCalculation();
		mudurSalaryCalculation.salaryCalculation();

		VeznedarSalaryCalculation veznedarSalaryCalculation = new VeznedarSalaryCalculation();
		veznedarSalaryCalculation.salaryCalculation();

		// önemli POLYMORPHİSM giriş
		BaseSalaryCalculation baseSalaryCalculation = new MuhendisSalaryCalculation();
		baseSalaryCalculation.salaryCalculation();

//		***Inheritance***
//		Nerede ve ne zaman kullanılır?
//		1-Hiyerarşik yapıda yer alan farklı nesnelerin birbiriyle iletişim kurmasını istediğimiz durumlarda kullanılır.
//		2-is a relationship(-dır, -dir ilişkisi. Pilot kalem kalemdir.)

//		subclass, superclass'tan daha geniş ve spesifiktir.	
//		superclass'da private olarak tanımlanan attributes ve activites subclass'dan erişilemez. 

//		***Final keyword***
//		Bir class'ı final olarak tanımlarsak, o class inherit edilemez.(prevent inheritance) Math class'ı final olarak tanımlanmıştır.
//		Bir metodu final olarak tanımlarsak, override edilemez.(prevent overrididing) prevent=önlemek

//		***Overriding***
//		superclass'da tanımlanmış bir metodun signature(metot ismi + parametre listesi)'ı 
//		aynı kalacak şekilde subclass'ta gövdesinin yeniden tanımlanması, 
//		'spesifik implementasyon'.
//		run-time polymorphism'e olanak sağlar.
//		override edilen metotun return type'ı baseclass'da tanımlanan metot ile aynı olmalıdır.
//		static metotlar override edilemez.(Math sınıfının metotları)(main metotu)(static metotlar nesneden bağımsızdır ama override'ın olayı nesnelerin birbiri ile konuşması olduğu için static metotlar override edilemez.)
	}
}
