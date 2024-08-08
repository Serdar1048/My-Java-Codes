
public class BilgiIslem extends Memurlar {
	String gorev;

	public BilgiIslem(String adsoyad, String eposta, String telefon, String departman, String mesai, String gorev) {
		super(adsoyad, eposta, telefon, departman, mesai);
		this.gorev = gorev;
	}

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}
}
