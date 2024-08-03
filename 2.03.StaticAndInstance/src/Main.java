
//classlar doğası gereği dinamik yapılar olduğu için onlara static demeyiz(nested class hariç)
public class Main {// değişkenlerin tanımlandığı(depolandığı) alana(field) göre --> instance ve
					// static variable
	public /* static */ int sayi1 = 6; // instance variable. nesnenin attribute'u(özellik).

	public static void main(String[] args) {// static değişkenlere static alanlardan erişilebilir nonstatic değişkenlere
											// (instance variable)nonstatic alanlardan erişilebilir.e
		int sayi = 5;
		sayi = 7;
		System.out.println(sayi);
//		sayi1 = 4; // static olmayan bir yerde tanımladığımız için static alanda erişemiyoruz.
		// bu durumu iki yolla çözebiliriz 1-> değişkene static keyword'ünü girmek
		// 2-> nesne oluşturmak
		Main main = new Main(); // nesne oluşturduk. 
		main.sayi1 = 8;
		System.out.println(main.sayi1);

//		***instance-> obje, nesne demek. RAM'de kendisi için yer ayrılan varlık.Non-static field'da depolanırlar, dolayısıyla erişmek için nesne gereklidir. Nesnenin kendine ait olan özellikleridir.(attributes). Her nesnenin, bu özellikler için kendi kopyası vardır(nesnenin tanımıyla alakalı). Nesne heap'de oluşur object referer ile onu stack'ten point ederiz.
//		***static variable-> bahsi geçen sınıfa ait kaç nesne tanımlandığına bakılmaksızın(nesneden bağımsız) tüm nesneler için değeri aynı olan değişkenlere denir.(math sınıfı örnek olarak gösterilebilir). RAM'de sadece bir kopyası oluşturulur ve program sonlandığında RAM'den silinir. Class adıyla çağırılabilir. 

		// Person
		Person person = new Person();
		Person person1 = new Person();

		person.firstName = "Furkan";
		person1.firstName = "Anil";

		person.lastName = "Baysan";
		person1.lastName = "Toprak";

		person.age = 23;
		person1.age = 22;
		
		System.out.println(person.firstName + person.lastName + person.age);
		System.out.println(person1.firstName + person1.lastName + person1.age);

		// Ford
		Ford focus = new Ford();
		Ford mondeo = new Ford();
		focus.numberOfGears = 6; // RAM'de tek bir kopyası olduğu için birindeki değişim diğerini de etkiliyor.
		mondeo.numberOfGears = 5;
		System.out.println(focus.numberOfGears);
		System.out.println(mondeo.numberOfGears);

		Ford.numberOfGears = 8; // direkt sınıf adıyla çağırabilirim.
		System.out.println(Ford.numberOfGears);
		
	}
}
