
public class test {

	public static void main(String[] args) {
//		byte --> -128 ve 127 arasında değerler alır. 1byte
		byte sayi = -128;
		System.out.println(sayi);

//		short --> -32768 ve 32767 arasında değerler alır. 2byte
		short sayi1 = 32767;
		System.out.println(sayi1);

//		int --> 9 basamağa kadar çıkabilen sayıları tanımlarken kullanılır. 4byte
		int sayi2 = 1234567890;
		System.out.println(sayi2);

//		long --> çok büyük sayılar için kullanılır. 8byte
		long maxDeger = Long.MAX_VALUE;
		long minDeger = Long.MIN_VALUE;
		System.out.println(maxDeger);
		System.out.println(minDeger);

		long sayi3 = 995494591231235454L;
		System.out.println(sayi3);

//		float --> ondalıklı sayı tanımlamak için kullanılır noktadan sonra 7 basamak çıkabilir. 4byte
		float ondalikliSayi = 3.21235571233221F;
		System.out.println(ondalikliSayi);

//		double --> ondalıklı sayı tanımlamak için kullanılır noktadan sonra 17 basamak çıkabilir. 8byte
		double ondalikliSayi2 = 3.21235571233221;
		System.out.println(ondalikliSayi2);

//		boolen --> true ve false.
		boolean sonuc = true;
		boolean sonuc1 = 2 > 5;
		System.out.println(sonuc);
		System.out.println(sonuc1);

//		char --> tek bir karakteri tanımlamak için kullanılır('a'). 2byte
		char karakter = '?';
		System.out.println(karakter);

//		String --> metinsel ifadeler için kullanılır("Serdar 1").
		String metin = "Serdar 1" + " Dedebaş 2";
		System.out.println(metin);

	}

}
