
public class Main {

	public static void main(String[] args) {
		// runtime polymorphism
//		BaseCreditManager creditManager = new StudentCreditManager();
//		System.out.println(creditManager.creditCalculate(1000.0));
//		
//		BaseCreditManager creditManager1 = new TeacherCreditManager();		
//		System.out.println(creditManager1.creditCalculate(1000.0));
//	
		BaseCreditManager a = new StudentCreditManager(); 

		// yukarıda yapılanın daha gerçek hayata uygun hali:
		BaseCreditManager[] baseCreditManagers = new /*(tipi-->)*/BaseCreditManager[] { new SoldierCreditManager(),
				new StudentCreditManager(), new TeacherCreditManager() };

		for (/*(tipi-->)*/BaseCreditManager creditManager : baseCreditManagers) {
			System.out.println(creditManager.creditCalculate(1000.0));
		}//baseCreditManagers object referer'ının refer ettiği tüm nesneleri gez.
	

//
//		***Polymorphism(Çok Şekillilik)***
//		En yaygın kullanımı superclass nesnenin referansının(object referer - pointer) subclass nesnesini 
//		işaret(refer - point) etmesidir.

//		Polimorfik yapılar oluşturmanın koşulları nelerdir?
//		-farklı nesneler arasındaki -dır, -dir ilişkileri ve overriding altyapısı ile mümkün kılınır.

//		iki farklı polymorphism vardır:

//		1-Runtime(Dynamic) polymorphism--> Base class'ın kalıtım ilişkisi(inheritance relationship) 
//		ve overriding konsepti sayesinde, onu inherit eden subclass nesnelerini işaret(point - refer) 
//		edebilmesi, onlar gibi davranabilmesidir.(gerçek hayatta daha çok bu kullanılır)

//		2-Compile-time(static) polymophism--> Method overloading veya operator overloading('+' opertörü) ile sağlanır.
	}
}
