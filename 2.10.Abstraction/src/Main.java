
public class Main {

	public static void main(String[] args) {

		BaseScoreCalculator menScoreCalculator = new MenScoreCalculator();
		menScoreCalculator.scoreCalculate();
		menScoreCalculator.gameOver();

		BaseScoreCalculator womenScoreCalculator = new WomanScoreCalculator();
		womenScoreCalculator.scoreCalculate();
		womenScoreCalculator.gameOver();

		BaseScoreCalculator childScoreCalculator = new ChildScoreCalculator();
		childScoreCalculator.scoreCalculate();
		childScoreCalculator.gameOver();

//		***Abstraction***
//		-Kullanıcıdan implementasyon detayları gizlenip, sadece fonksiyonelliğin sağlandığı süreçtir(Kullanıcı nesenin nasıl yaptığını değil, ne yaptığını bilir.)
//		-İmplementasyon detayları(komut kümleri) gizleniyor (base class'ın içinde) bu metot protatip olarak belirtiliyor bu metotu birileri kendileri için spesifik olarak implemente ediyorlar.

//		*Abstraction nasıl sağlanır?*
//		-Abstract class ve interface(%100) konseptleri ile sağlanır.

//		*Abstraction ne zaman kullanılır?*
//		-Birbirinin alternatifi olan, birden fazla ve farklı subclass nesnesinin ortak olarak barındırdığı
//		metotlar varsa ve baseclass nesnesinin davranışları gizlenip actual(esas) implementation'ının subclass 
//		nesneleri tarafından yapılmasını istiyorsak kullanırız.

//		*Abstract class ve methodlar ile ilgili kurallar*
//		-Abstract class'lar abstract veya abstract olmayan methodlar içerebilir.
//		-Abstract metotlar baseclass içerisinde prototip olarak tanımlanır.
//		-Prototip metot --> imzası olan(isim ve parametre listesi), gövdesi olmayan metottur.
//		-Bir sınıf bir veya daha fazla abstract metot içeriyorsa, abstract olarak tanımlanmalıdır.
//		-Bir class abstract olarak tanımlanırsa nesnesi oluşturulamaz.(heap'de kendisi için bir yer ayrılamaz) ('new' keywordunu kullanmayız.)
//		-Abstract bir class'ı inherit eden subclass nesneleri abstract class'da prototip olarak tanımlanmış abstract metotları override etmek zorundadır. (aslında bağlantıyı sağlıyor) 
//		-Abstract classlar 'final' metotlar içerebilir.(final metotlar override edilemez.) demek ki baseclass'da tanımlandığı şekliyle kullanılmak zorunda bırakıyoruz.

	}

}
