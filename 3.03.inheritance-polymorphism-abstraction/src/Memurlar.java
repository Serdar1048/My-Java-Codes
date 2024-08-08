
public class Memurlar extends Calisan {
	String departman, mesai;

	public Memurlar(String adsoyad, String eposta, String telefon, String departman, String mesai) {
		super(adsoyad, eposta, telefon);
		this.departman = departman;
		this.mesai = mesai;
	}

//  ***OVERRIDING***
	public String giris() {
		return super.giris() + " B kapısından";
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public String getMesai() {
		return mesai;
	}

	public void setMesai(String mesai) {
		this.mesai = mesai;
	}
}
