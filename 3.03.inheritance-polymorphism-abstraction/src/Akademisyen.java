
public abstract class Akademisyen extends Calisan {

	private String bolum, gorevler;
	private String ders;

	public Akademisyen(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String ders) {
		super(adsoyad, eposta, telefon);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.ders = ders;
	}

	public abstract void derseGir(int dersSaati); //abstraction

//  ***OVERRIDING***
	public String giris() {
		return super.giris() + " A kapısından";
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorevler() {
		return gorevler;
	}

	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}
}
