
public class Akademisyen implements ICalisan{
	private String adSoyad, bolum, gorevler;

	@Override
	public void giris() {
		System.out.println("Giriş yapıldı.");
	}

	@Override
	public void cikis() {
		System.out.println("Çıkış yapıldı");
	}

	@Override
	public boolean yemek(int saat) {
		System.out.println("Yemek yendi");
		return true;
	}
	
	public Akademisyen(String adSoyad, String bolum, String gorevler) {
		
		this.adSoyad = adSoyad;
		this.bolum = bolum;
		this.gorevler = gorevler;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
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

	
	

}
