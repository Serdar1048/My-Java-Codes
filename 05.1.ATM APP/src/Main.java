import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double bilalBakiye = 2450;
		String bilalIban = "TR 00";
		String bilalKullaniciAdi = "bilal12";
		String bilalSifresi = "123";

		double enesBakiye = 1200;
		String enesIban = "TR 1000";
		String enesKullaniciAdi = "enes55";
		String enesSifresi = "456";

		String islemSecenekleri = "1-Bakiye Görüntüleme" + "\n" + "2-Para Çekme" + "\n" + "3-Farklı Hesaba Para Yatırma"
				+ "\n" + "q-Çıkış" + "\n" + "Yapmak İstediğiniz İşlemi Seçiniz: ";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Merhaba Hoşgeldiniz");

		System.out.print("Kullanıcı adınızı giriniz: ");
		String kullaniciAdi = scanner.nextLine();

		System.out.print("Şifrenizi giriniz: ");
		String sifre = scanner.nextLine();

		if (kullaniciAdi.equals(bilalKullaniciAdi) && sifre.equals(bilalSifresi)) {
			System.out.println("Bilal'İn Hesabına giriş yapıldı.");
			System.out.println(islemSecenekleri);
			String secim = scanner.nextLine();
			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz: " + bilalBakiye);
				break;

			case "2":
				System.out.println("Çekmek İstediğiniz Miktarı Girin: ");
				int miktar = scanner.nextInt();

				if (bilalBakiye >= miktar) {

					System.out.println("Çekilen Miktar: " + miktar);
					bilalBakiye -= miktar;
					System.out.println("Kalan Bakiye: " + bilalBakiye);
				} else {
					System.out.println("O kadar bakiyeniz yok !!!!");
				}
				break;

			case "3":
				System.out.println("Yatırmak istediğiniz miktarı seçiniz: ");
				int yatirilanMiktar = scanner.nextInt();
				if (bilalBakiye >= yatirilanMiktar) {
					System.out.println("IBAN Giriniz: ");
					scanner.nextLine();
					String yatirilacakIban = scanner.nextLine();
					if (yatirilacakIban.equals(enesIban)) {
						System.out.println("Enes'in hesabına para gönderiliyor..");
						bilalBakiye -= yatirilanMiktar;
						System.out.println("Yatırdığınız Miktar: " + yatirilanMiktar);
						enesBakiye += yatirilanMiktar;
						System.out.println("Kalan Bakiyeniz: " + bilalBakiye);
					}
				} else {
					System.out.println("Yetersiz bakiye!!");
				}
				break;

			case "q":
				System.out.println("Çıkış Yapılıyor..");
			}

		} else if (kullaniciAdi.equals(enesKullaniciAdi) && sifre.equals(enesSifresi)) {
			System.out.println("Enes'İn Hesabına giriş yapıldı.");
			System.out.println(islemSecenekleri);
			String secim = scanner.nextLine();
			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz: " + enesBakiye);
				break;

			case "2":
				System.out.println("Çekmek İstediğiniz Miktarı Girin: ");
				int miktar = scanner.nextInt();

				if (enesBakiye >= miktar) {

					System.out.println("Çekilen Miktar: " + miktar);
					enesBakiye = enesBakiye - miktar;
					System.out.println("Kalan Bakiye: " + enesBakiye);
				} else {
					System.out.println("O kadar bakiyeniz yok !!!!");
				}
				break;

			case "3":
				System.out.println("Yatırmak istediğiniz miktarı seçiniz: ");
				int yatirilanMiktar = scanner.nextInt();
				if (enesBakiye >= yatirilanMiktar) {
					System.out.println("IBAN Giriniz: ");
					scanner.nextLine();
					String yatirilacakIban = scanner.nextLine();
					if (yatirilacakIban.equals(bilalIban)) {
						System.out.println("Bilal'in hesabına para gönderiliyor..");
						enesBakiye -= yatirilanMiktar;
						System.out.println("Yatırdığınız Miktar: " + yatirilanMiktar);
						bilalBakiye += yatirilanMiktar;
						System.out.println("Kalan Bakiyeniz: " + enesBakiye);
					}
				} else {
					System.out.println("Yetersiz bakiye!!");
				}
				break;

			case "q":
				System.out.println("Çıkış Yapılıyor..");
			}
		} else {
			System.out.println("Kullanıcı adınız veya şifreniz yanlış!!");
		}
	}
}
