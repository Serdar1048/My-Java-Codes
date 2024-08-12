import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("************UYGULAMAYA HOŞGELDİNİZ**********");

		Scanner scanner = new Scanner(System.in);

		System.out.print("No değerini giriniz: ");
		int no = scanner.nextInt();
		scanner.nextLine();

		System.out.print("İsim değerini giriniz: ");
		String isim = scanner.nextLine();

		System.out.print("Soyisim değerini giriniz: ");
		String soyisim = scanner.nextLine();

		System.out.print("Tecrübe(yıl) değerini giriniz: ");
		int tecrube = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Maas değerini giriniz: ");
		double maas = scanner.nextDouble();
		scanner.nextLine();

		Calisan calisan1 = new Calisan(no, isim, soyisim, tecrube, maas);
		System.out.println("*****************************************");
		String islemler = "1-Çalışan bilgilerini göster\n" + "2-Zam yap\n" + "3-Format at";
		System.out.println(islemler);
		System.out.print("Seçim yapınız: ");
		int secim = scanner.nextInt();
		scanner.nextLine();

		switch (secim) {
		case 1:
			calisan1.calisanBilgileriGoster();
			break;

		case 2:
			System.out.print("Zam miktarını giriniz: ");
			int zamMiktarı = scanner.nextInt();
			calisan1.zamYap(zamMiktarı);
			break;

		case 3:
			System.out.print("İşletim sistemini giriniz: ");
			String isletimSistemi = scanner.nextLine();
			calisan1.formatAt(isletimSistemi, isim);
			break;

		default:
			System.out.println("Lütfen düzgün bir sayı seçiniz!!");
			break;
		}
	}
}
