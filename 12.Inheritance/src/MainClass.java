import model.A;
import model.Hayvan;
import model.Kedi;
import model.Kopek;

public class MainClass {

	public static void main(String[] args) {
		// kalıtımın en güzel avantajı üst sınıflarrda tanımlanan metotve değişkenleri
		// tekrar tekrar yazmaktan kurtarmasıdır.

		// bir classı yüzlerce class miras alabilir fakat bir class sadece bir kişiyi
		// miras alabilir.

//		Hayvan hayvan1 = new Hayvan();
//		hayvan1.nefesAl();
//
//		System.out.println("********************");
//
//		Kopek kopek1 = new Kopek();
//		kopek1.nefesAl();
        
		
		// CONSTRUCTOR
//		@SuppressWarnings("unused")
//		A aNesnesi = new A(); // ilk önce miras aldığı classın constructor çalışır bu yüzden C classının
						      // constructor çalışır. Çalışma sırası --> C-B-A şeklinde olur.

		
		// this super super()
		
		// this --> bulunduğumuz classı temsil ediyor
		// super --> miras aldığımız classı temsil ediyor.
		// super() --> miras aldığımız classın constructor ını temsil eder.
		
//		A aNesnesi = new A(5, 8);
//		System.out.println("bdeğişken1: " + aNesnesi.bDegisken1);
//		System.out.println("bdeğişken2: " + aNesnesi.bDegisken2);
		
//      ***************************************************************
        //override
		
		Hayvan hayvan1 = new Hayvan();
		hayvan1.sesVer();
		
		Kedi kedi1 = new Kedi();
		kedi1.sesVer();
		
		Kopek kopek1 = new Kopek();
		kopek1.sesVer();
		
		
		
		
		
		
	}

}
