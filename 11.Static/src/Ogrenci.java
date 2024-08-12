
public class Ogrenci {
	private Long id;

	private String ad;

	private static String soyad; //nesneye değil sınıfa özgü bir değişkendir

	public String numara;

	public static void numaraYazdir() {
//		System.out.println("numara--> " + numara);
		// static metotların içerisinde static olmayan hiçbir şeye
		// erişemeyiz.(değişken,metot)
		Ogrenci ogrenci = new Ogrenci(); // nesne üretmemiz lazım buradan erişmek istiyorsak
		ogrenci.ad = "asd";

	}

	public void ogrenciBilgileri() {// bu metot static olmadığı için burada static olmayan değişkenlerime
									// erişebildim.

		// Static olmayan bir metot içinde her şeye erişebiliriz.
		System.out.println("id: " + getId());
		System.out.println("ad: " + getAd());
		System.out.println("soyad: " + getSoyad());
		numaraYazdir(); // aynı zamanda static olmayan bu metotta static olan başka bir metota
						// erişebilirim.
		soyad = "asd"; // aynı zamanda static olmayan bu metotta static olan değişkenlerime de
						// erişebilirim.
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

}
