
public class Asistan extends Akademisyen {
	protected String yuksekLisans;

	public Asistan(String yuksekLisans, String bolum, String gorevler, String ders, String adsoyad, String eposta,
			String telefon) {
		super(bolum, gorevler, ders, adsoyad, eposta, telefon);
		this.yuksekLisans = yuksekLisans;

	}

//  ***OVERRIDING***
	public void derseGir(int dersSaati) {
		System.out.println(getAdsoyad() + " " + getDers() + " saat: " + dersSaati + " dersine asistan olarak girdi.");

	}

//  ***OVERRIDING***
	public String giris() {
		return "asistan " + super.giris();
	}

	public String getYuksekLisans() {
		return yuksekLisans;
	}

	public void setYuksekLisans(String yuksekLisans) {
		this.yuksekLisans = yuksekLisans;
	}

}
