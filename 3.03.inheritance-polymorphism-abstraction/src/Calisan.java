
public class Calisan {
	private String adsoyad, eposta, telefon;
	static int girisSayisi;

	public String giris() {
		return this.adsoyad + " giriş yaptı";
	}

	public Calisan(String adsoyad, String eposta, String telefon) {
		this.adsoyad = adsoyad;
		this.eposta = eposta;
		this.telefon = telefon;
	}

	public static void listele(Calisan[] girisYapanlar) {
		for (Calisan c : girisYapanlar) {
			System.out.println(c.giris());
		}
	}

	public String getAdsoyad() {
		return adsoyad;
	}

	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}
