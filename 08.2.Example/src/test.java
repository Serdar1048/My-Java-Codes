import java.util.Scanner;

public class test {
	static boolean aktif = true;
	static String dogruKullaniciAdi = "enes";
	static String dogruSifre = "123";

	public static void main(String[] args) {
		sorgu();
	}

	public static boolean dogruMu(String girilenKullaniciAdi, String girilenSifre) {
		if (girilenKullaniciAdi.equals(dogruKullaniciAdi) && girilenSifre.equals(dogruSifre)) {
			return true;
		} else {
			return false;
		}
	}

	public static void sorgu() {
		Scanner scanner = new Scanner(System.in);

		int hakSayisi = 3;
		while (aktif) {
			System.out.print("Kullanıcı Adınız: ");
			String girilenKullaniciAdi = scanner.nextLine();
			System.out.print("Şifreniz: ");
			String girilenSifre = scanner.nextLine();
			if (dogruMu(girilenKullaniciAdi, girilenSifre)) {
				System.out.println("Giriş yapıldı");
				break;
			} else {
				System.out.println("Kullanıcı adınız veya şifreniz yanlış!!!!");
			}
			hakSayisi--;

			if (hakSayisi == 0) {
				System.out.println("Hak sayınız dolmuştur");
				System.out.println("Hesap bloke oldu");
				aktif = false;
			}
		}
	}
}