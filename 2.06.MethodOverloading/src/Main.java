import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// Method Overloading
//		Nedir ? Bir sınıfın (class) kendi tanım aralığı içinde, aynı ismi taşıyan ancak farklı parametre türlerine veya adedine sahip birden fazla metodu barındırmasına olanak vermesidir.
//		Method signature --> metot ismi + parametre listesi(parametre türleri veya adeti)
//		Source code  --compile->  byte code(ara kod)  --interpret->  executable.
//		Derleme zamanı konseptidir. (Compile-time polymorphism)
//		Metodun döndürdüğü değerin tipinin bir önemi yok. Void yazmayadabiliriz.
//		İmzası (Signature) aynı iki eylemi aynı sınıfın sınırları içerisinde tanımlarsak derleme zamanı hatası (compile-time error) alırız.

		Calculator calculator = new Calculator();
		calculator.add(10, 20);
		System.out.println(calculator.add(20.5, 50.5, 70.5));

//		Metotların Aşırı Yüklenmesi (Method Overloading) Nerde ve Ne Zaman Kullanılmalıdır?
//		Aynı eylemi (metodu) parametre türlerini veya adedini değiştirerek farklı şekillerde kullanmak istediğimizde aşırı yüklemeliyiz. (overloading)
//		"+" operatörü overloading edilmiştir--> oparetör overloading. javada sadece "+" operatöründe görürüz.
	}
}