
public class Main {

	public static void main(String[] args) {
//		Calisan c1 = new Calisan("calışan", "a@b.com", "055500000");
//		Akademisyen a1 = new Akademisyen("akademisyen", "asd", "02", "aa", "qq", "mat");
////	System.out.println(a1.getAdsoyad());
		OgretimUyesi o1 = new OgretimUyesi("serdar", "abc@def", "05050505", "ceng", "rapor", "ceng101", "doçent");
		OgretimUyesi o2 = new OgretimUyesi("mehmet", "abc@def", "05050505", "ceng", "rapor", "ceng101", "doçent");
//		Guvenlik g1 = new Guvenlik("guvenlik", "bb", "cc", "dd", "ee", "ff");
//		Memurlar m1 = new Memurlar("ali", "bb", "cc", "dd", "ee");
		Asistan as = new Asistan("mehmet", "ali", "05050505", "ceng", "rapor", "asd", "asd");
//		BilgiIslem b1 = new BilgiIslem("bilgiişlem", "bb", "cc", "dd", "ee", "dd");
//		System.out.println(as.giris());
//		System.out.println(m1.giris());
//		System.out.println(g1.giris());
//		System.out.println(o1.giris());
//		System.out.println(a1.giris());
//		System.out.println(c1.giris());
//		System.out.println(b1.giris());
//
//		a1.derseGir();
//		o1.derseGir();
		
//      ***Polymorphism***
//		Calisan c = new Akademisyen("polyakademisyen", "asd", "02", "aa", "qq", "mat");
//		System.out.println(c.giris());//akademisyen gibi davranır.
		
//		Calisan[] girisListesi = {a1,o1,m1};
//		Calisan.listele(girisListesi);
		
		
//		***Abstraction***
		Akademisyen asistan = new Asistan("mehmet", "ali", "05050505", "ceng", "rapor", "asd", "Ceng");
		asistan.derseGir(10);
		Akademisyen ogretimUyesi = new OgretimUyesi("koray", "abc@def", "05050505", "ceng", "rapor", "ceng101", "doçent");
		ogretimUyesi.derseGir(10);
		
		
	}
}
