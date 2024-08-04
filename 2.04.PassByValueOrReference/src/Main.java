
public class Main {

	public static void main(String[] args) {
		int number = 5; // static variable
		System.out.println("previous value of number: " + number); // 5
		changeTheValue(number); // 10
		System.out.println("current value of number: " + number); // 5

//	    pass by reference--> değişkenlerin metotlara referanslarıyla geçmesi
//	    aslında parametre olarak orijinal değeri vermiş oluyoruz. ORİJİNAL VERİ DEĞİŞİR.

		PassByReference reference = new PassByReference();

		reference.number2 = 7;
		System.out.println("previous value of number2: " + reference.number2); // 7
		reference.change(reference);
		System.out.println("current value of number2: " + reference.number2); // 10

		//ARRAY
		int[] array = new int[] { 2, 4, 6 };
		System.out.println("First element of array: " + array[0]);

		ArrayAsAReference arrayAsAReference = new ArrayAsAReference();
		arrayAsAReference.changeTheArray(array);
		System.out.println("current value of first element: " + array[0]);
	}

	
	// pass by value--> değişkenlerin metotlara değeriyle geçmesi.
	public static void changeTheValue(int number) {
		// parametre olarak verilen değer bir kopya.
		// bir kopya ile işlem yaptığım için ORİJİNAL VERİ DEĞİŞMEZ.
		number = number + 5;
//		System.out.println(number); // 10

		// pass by reference ile orijinal verinin değişmemesini nasıl sağlarız?
		// RAM'de başka bir alanı point etmesi gerekiyor.(PassByReference.java line6)

	}
}