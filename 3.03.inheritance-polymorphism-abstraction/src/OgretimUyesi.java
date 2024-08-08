
public class OgretimUyesi extends Akademisyen {
	String unvan;

	public OgretimUyesi(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String ders,
			String unvan) {
		super(adsoyad, eposta, telefon, bolum, gorevler, ders);
		this.unvan = unvan;
	}

//	***OVERRIDING***
	public void derseGir(int dersSaati) {
		System.out
				.println(getUnvan() + " " + getAdsoyad() + " " + getDers() + " saat: " + dersSaati + " dersine girdi.");
	}

//  ***OVERRIDING***
	public String giris() {
		return this.unvan + " " + super.giris();
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
}
