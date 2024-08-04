
public class Main {

	public static void main(String[] args) {
//		***CONSTRUCTOR***
//	    -!!nesne oluşturulduğu anda çağırılır, çalıştırılır.
//		-!!sınıfta default constructor tanımlanmasa da vardır. 
//		-!!başlangıç(ilk) değer ataması yapabilir.(initializing attributes)(diğer metotlardan bu özelliği ile ayrılır.)
		Product product = new Product(); // Product()--> bizim constructor'ımızdır.
		System.out.println(product.name + product.model + product.price + product.stockAmount);

		Product product1 = new Product("Lenovo", "ideaPad", 5000, 300);// normal metotdan ayıran özellik.
		System.out.println(product1.name + product1.model + product1.price + product1.stockAmount);

//		Product product2=new Product("asd" ,10);
//		Product product3 = new Product(12, "12");

		// !!constructor'ı nerde ve hangi amaçla kullanırız?
		// nesnenin uzun sürede değişmeyeceğini düşündüğümüz attributes'larına değer
		// ataması(initialization) yapmak için kullanırız. Aksi halde manuel olarak
		// değer ataması yapabiliriz.

//		***this*** keyword'ü
		/*
		 * 1-'bu nesne' demektir. hali hazırda tanımlanmış olan nesnenin attribute ve
		 * activity'lerine erişebiliriz.
		 * 
		 * 2-this() veya this(parametreler)ile aynı sınıftaki diğer bir constructor'ı
		 * yine this() veya this(parametreler) ile belirttiğimiz constructor içinde
		 * çağırabiliriz. Amacı--> Bunu yaparak, default veya parametreli constructor
		 * ile muhattap olan nesnenin attribute'larını, default olan constructor'da
		 * parametreli olanı çağırıyorsak parametreli constructor ile, parametreli olan
		 * constructor'da default olanı çağırıyorsak default constructor ile
		 * yapılandırmış oluruz.
		 */

	}

}
