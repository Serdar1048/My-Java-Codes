import java.util.Scanner;

public class test {

	public static void main(String[] args) {// ÖRNEK
		// DİZİNİN ELEMANLARINI KULLANICIDAN AL DAHA SONRA DİZİNİN İÇİNDEKİ ELEMANLARIN
		// ASAL OLANLARINI VE OLMAYANLARINI AYRI BİR ŞEKİLDE YAZDIRALIM

		System.out.println("ASAL SAYI BULMA UYGULAMSINA HOŞGELDİNİZ");
		System.out.println("***************************************");

		int sayacAsal = 0;
		int sayacAsalDegil = 0;

		String asalSayilar = "";
		String asalOlmayanSayilar = "";

		boolean asalMi = false;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Dizinin eleman sayısını giriniz : ");
		int elemanSayisi = scanner.nextInt();
		scanner.nextLine();

		int[] sayilar = new int[elemanSayisi];

		for (int i = 0; i < elemanSayisi; i++) {
			System.out.print("Dizinin " + i + ". index değerini giriniz : ");
			sayilar[i] = scanner.nextInt();
			scanner.nextLine();
		}

		for (int sayi : sayilar) {
			for (int j = 2; j < sayi; j++) {
				if (sayi % j == 0) {
					sayacAsalDegil++;
					asalOlmayanSayilar += String.valueOf(sayi) + " ";
					asalMi = false; // ---> bu satır önemli!!!
					break;
				} else {
					asalMi = true;
				}
			}
			if (asalMi) {
				sayacAsal++;
				asalSayilar += String.valueOf(sayi) + " ";
//				asalMi = false;  ---> Bu satır olmadan da kod çalışıyor fakat videoda bu satır da var.
			}
		}
		System.out.println("ASAL BİLGİLERİ");
		System.out.println("Asal toplam = " + sayacAsal + "  Asal Sayılar = " + asalSayilar);

		System.out.println("***************************************************");

		System.out.println("ASAL OLMAYAN BİLGİLERİ");
		System.out.println("Asal Olmayan toplam = " + sayacAsalDegil + "  Asal Olmayan Sayılar = " + asalOlmayanSayilar);

	}

}
