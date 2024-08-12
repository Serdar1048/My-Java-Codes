
public class Calisan {

	public int no;

	public String isim;

	public String soyisim;

	public int tecrube;

	public double maas;

	public Calisan(int no, String isim, String soyisim, int tecrube, double maas) { // Kısayol--> ALT+SHİFT+S
		this.no = no;
		this.isim = isim;
		this.soyisim = soyisim;
		this.tecrube = tecrube;
		this.maas = maas;
	}

	public void calisanBilgileriGoster() {
		System.out.println("***********ÇALIŞAN BİLGİLERİ***********");
		System.out.println("Numarası: " + this.no);
		System.out.println("İsim: " + isim);
		System.out.println("Soyisim: " + this.soyisim);
		System.out.println("Tecrübe: " + this.tecrube);
		System.out.println("Maaş: " + maas);
	}

	public void zamYap(int zamDegeri) {
		System.out.println("Maaşınıza " + zamDegeri + " TL zam yapıldı.");
		System.out.println("Yeni maaşınız " + (maas + zamDegeri) + " TL olmuştur.");

	}
	
	public void formatAt (String isletimSistemi , String kim) {
		System.out.println(kim + " şuanda " + isletimSistemi+ " işletim sistemine format atıyor.");
	}
}











