
public class Main {

	public static void main(String[] args) {
		Person person = new Person();

		person.firstName = "Furkan";// public tanımlandığı için farklı bir class'da erişebildim.
		person.lastName = "Baysan";
		person.age = 22;

//		person.email = "abcdefg";

		person.setEmail("def@asd");
		System.out.println(person.getEmail());

		person.setEmail("abc");
		System.out.println(person.getEmail());

//		***Encapsulation***
		// 1-bir class'ın içerisindeki deklere(belirtilen) edilen verilere diğer
		// sınıflardan erişimin sınırlandırılmasıdır.
		// 2-verilerin tek bir ünite altında toplanmasıdır.(wrapping up of a data under
		// a single unit)
		// (Hastayım, ilaç(class) içicem, ilacın içeriğini(veri) bilmememe rağmen o
		// ilacı içiyorum, iyileşmek için.)

//		Encapsulation nasıl sağlanır?
//		sınıfın içerisinde istenilen verilerin(attributes) private olarak tanımlanıp, o verilerinin değerlerinin döndürülmesi ve onlara değer atanması için yine o sınıfın içinde belirtilen public methodların kullanılmasıyla gerçekleştirilir.

//		***access modifiers(erişim belirliyecileri)***
//o sınıf == tanımlandığı sınıf 
		// Public--> Her yerden erişilebilir.(o sınıftan, o sınıfla aynı paketteki
		// sınıflardan ve o sınıfı inherit eden alt sınıflardan (subclasses)
		// erişilebilir.)

		// Private--> Sadece tanımlandığı sınıftan erişilebilir. Başka bir sınıftan asla
		// erişilemez.

		// Protected--> o sınıftan, o sınıfla aynı paketdeki sınıflardan ve o sınıfı
		// inherit eden alt sınıflardan(subclasses) erişilebilir. Fakat o sınıfla aynı
		// pakette olmayan ve aynı zamanda o sınıfı inherit etmeyen başka bir sınıf
		// tarafından erişilemez.
		// !! tablo var ona bak !!

//		*** getter and setter
//		sınıfın içerisinde private olarak tanımlanan verilere başka bir sınıftan
//		kontrollü olarak erişilmesine ve kullanılmasına olanak sağlayan metotlardır.
//		getter--> değişkenin değerini getirir return ile.
//		setter--> değişkenin değer atar.

	}
}
