
public class PassByReference {// nonstatic field
	public int number2; // instance variable

	public void change(PassByReference reference) { // object referer kısmını parametre olarak veriyoruz.
//		reference = new PassByReference(); // Orjinal veri değişmesin istersek --> RAM'de yeni bir yeri
//										point ediyor. Bu sayede orijinal veride bir değişiklik olmuyor.		
		reference.number2 = reference.number2 + 3; // orijinal veri ile işlem yaptığım için orijinal veri değişti.

	}
}
