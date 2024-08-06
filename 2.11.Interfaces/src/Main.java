
public class Main {

	public static void main(String[] args) {
		Customer firstCustomer = new Customer();// instance(OOP bakış açısı), record(veri tabanı bakış açısı)
		firstCustomer.setId(1);
		firstCustomer.setCustomerNumber(1234);
		firstCustomer.setFirstname("Koray");
		firstCustomer.setLastName("ürün");
		firstCustomer.setAge(34);

		Customer secondCustomer = new Customer(2, 5678, "Melis", "kırık", 25);

//		Logger logger = new DatabaseLogger();
//		logger = new EmailLogger();
//		logger = new SmsLoger();

		Logger[] loggers = { new EmailLogger(), new SmsLoger(), new DatabaseLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);

		customerManager.add(firstCustomer);
		System.out.println();
		customerManager.add(secondCustomer);

//		***Interface***
//		-'Referans tutucu'(object referer)(Base gibi) ve 'kural koyucu' gibi davranarak polimorfik yapılar 
//		oluşturmaya olanak tanıyan ve yazdığımız uygulamalarda genişletilebilirliği sağlayan (extensibilty(polymorphism) ve testability)
//	    OOP konseptidir.Birbirinin altrenatifi işleri yapan nesnelere. 'NE' yapmaları gerektiğini söyleyen ancak 'NASIL' yapacaklarını onlara bırakan bir konseptdir.

//		-Referans tutucu gibi davranması--> Birbirinin alternatifi işleri yapan subclass nesnelerinin RAM lokasyonlarını tutabilmesi.(interface'lerin base gibi davranmasıdır)

//		-Kural koyucu gibi davranması--> Base gibi davranan interface'in içerisinde tanımlanan methodu subclass'lar override etmek zorundadır.

//		-Abstract class ile farkı: %100 abstraction'ı sağlaması ve birbirinin alternatifi 
//		işleri yapan nesnelerin birden fazla interface'i implement edebiliyor olmasıdır. 
//		Oysaki bu birbirinin alternatifi işleri yapan nesneler sadece bir abstract class'ı inherit edebilir (JAVA'ya özgü)

//		-Interface'in en önemli görevi: Katmanlı mimari ile bir backend yazdığımız zaman 
//		katmanlar arası geçişi sağlamasıdır.--> extensibilty ve polymorfik yapılar oluşturulmasına olanak sağlamasıdır.

//		*Senaryo: Farklı müşteri tiplerini veritabanına ekledikten sonra, farklı loglama yöntemleri ile loglama yapabilmek.

//		**Dependency**--> CustomerManager nesnesinin bir logger'ı olmalı(bir logger nesnesinne sahip olmalı.
//		-Bir nesnenin başka bir nesneye(esasen o başka nesnenin bir eylemine veya eylemlerine) ihtiyacı olmasına dependency denir.

//		**Dependency Injection**--> CustomerManager nesnesi, istediği bir logger nesnesinin log(..)'una erişşip, çağırıp, kullanabilmeli.
//		-Başka bir nesneye (esasen o başka nesnenin bir eylemine veya eylemlerine)bağımlılığı olan nesne,
//		 run-time'da oluşurken, ona bağımlı olan nesne veya nesnelerin kim veya kimler olduğunu söylemenin yoludur.

//		**Composition**
//		! Bağımlılık kavramının altında yatan fikir HAS-A Relationship(sahip olma ilişkisi) yani Composition'dır.

//		*Amaç: CustomerManager'ın zaten bir logger nesnesine bağımlılığı var. Biz de diyoruz ki, en azından spesifik bir tanesine bağımlılığı olmasın.

	}
}
