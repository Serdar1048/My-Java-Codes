import java.util.Scanner;

public class test {
	public static void main(String[] args) {
// if - else
		double leb = 3.5;
		double fın = 15.7;
		double bad = 22;

		double maal = (12 * leb) + (25 * fın) + (40 * bad);

		double kazanc = (12 * 1.5 * leb) + (25 * 1.4 * fın) + (40 * 1.6 * bad);

		double kar = kazanc - maal;

		if (kar >= 500) {
			System.out.println("Kira ödenebilir " + kar);
		} else {
			System.out.println("Kira ödenemez");
		}

// switch - case
		Scanner scanner = new Scanner(System.in);

		System.out.println("bir sayı giriniz: ");
		int n = scanner.nextInt();

		switch (n) 
		{
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("salı");
			break;
		case 3:
			System.out.println("çarşamba");
			break;
		case 4:
			System.out.println("perşembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;

		default:
			System.out.println("1-7 arasında sayı girin");
		}

	}
}
