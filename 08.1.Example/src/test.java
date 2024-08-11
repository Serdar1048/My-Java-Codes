import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("SAYININ TEK Mİ ÇİFT Mİ OLDUĞUNU BULMA PROGRAMI");
		System.out.print("Dizinin eleman sayısını giriniz: ");

		int diziUzunluk = scanner.nextInt();
		scanner.nextLine();

		int[] sayilar = new int[diziUzunluk];

		for (int i = 0; i < diziUzunluk; i++) {
			System.out.print("Dizinin " + i + ". index değerini giriniz: ");
			sayilar[i] = scanner.nextInt();
			scanner.nextLine();
		}

		for (int sayi : sayilar) {
			tekMiCiftMi(sayi);
		}
	}

	public static void tekMiCiftMi(int sayi) {
		if (sayi % 2 == 0) {
			System.out.println(sayi + " Çifttir");
		} else {
			System.out.println(sayi + " Tektir");
		}

	}

}
