import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		boolean a = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz: ");
		int n = scanner.nextInt();
		if (n == 1) {
			a = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				a = false;
				break;
			}
		}
		System.out.println(a);
	}

}
