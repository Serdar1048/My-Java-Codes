
public class Calculator {
	public int sayi1, sayi2;
	public int sayi3, sayi4;

	public void add(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		System.out.println("toplam: " + toplam);
	}

	public double add(double sayi1, double sayi2, double sayi3) {
		double toplam1 = sayi1 + sayi2 + sayi3;
		return toplam1;
	}
}
