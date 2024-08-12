
public class test {
//static değilse nesneye özgüdür ve sadece o nesne o değere erişebilir diğer nesneler erişemez.
//ama static ise sınıfa özgüdür bütün nesneler o değere erişir.
	public static void main(String[] args) {
		// bir classın içerisindeki değişken veya metotlara classtan nesne oluşturmadan
		// direkt CLASS İSMİ üzerinden erişmemize olanak sağlayan anahtar kelimedir.
		// Static method veya static variable vardır.

		Ogrenci ogrenci1 = new Ogrenci();
//		ogrenci1.numara = "32432431";

//		Ogrenci.numara = "123";
//		System.out.println(Ogrenci.numara);
//		Math.max(0, 0); // gerçek hayattan bir örnek. Math Class'ına herhangi bir nesne üretmeden erişebiliyoruz. 		

//		Ogrenci.numara="123";
//		Ogrenci.numaraYazdir();
//		ogrenci1.setId(5L);
//		ogrenci1.setAd("sdf");
//		ogrenci1.setSoyad("asdasd");
//		ogrenci1.ogrenciBilgileri();

		ogrenci1.numara = "1111111111111";
		ogrenci1.setAd("abc");
		ogrenci1.setSoyad("def"); // soyad Ogrenci.java'da static tanımlanmıştır.
		System.out.println(ogrenci1.numara); // 1111111111111
		System.out.println(ogrenci1.getAd()); // abc
		System.out.println(ogrenci1.getSoyad());// def

		System.out.println("-------------------------------");

		Ogrenci ogrenci2 = new Ogrenci();

		System.out.println(ogrenci2.numara);// null
		System.out.println(ogrenci2.getAd()); // null
		System.out.println(ogrenci2.getSoyad());// def
		
		
		
		
		/*
		 soyad static değilse :
		 ogrenci1 --> soyad  --  nesneye özgüdür.
		 ogrenci2 --> soyad
		 
		 
		 soyad static ise :
		 ogrenci1
		         \
		         soyad -- sınıfa özgüdür.
		         /
		 ogrenci2
		 */
	}
	
	public void a () {
		
	}

}
