import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// Kullanıcıdan input alma
		// scanner
		Scanner scanner = new Scanner(System.in);

		System.out.println("Adınızı giriniz: ");
		String isim = scanner.nextLine();

		System.out.println("Soyadınızı giriniz: ");
		String soyisim = scanner.nextLine();

		System.out.println("YAş giriniz: ");
		int yas = scanner.nextInt();
		
		System.out.print("Kilonuzu giriniz: ");
		double kilo = scanner.nextDouble();

		System.out.println("Adınız " + isim + " soyadınız " + soyisim + " yasınız " + yas+ " kilonuz " +  kilo);

	}
}
