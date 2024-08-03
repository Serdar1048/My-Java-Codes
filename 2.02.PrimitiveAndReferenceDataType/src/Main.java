
public class Main { // değişkenlerin depoladıkları verinin türüne göre --> primitive ve reference

	public static void main(String[] args) {
//      ***primitive data types*** KOPYA İLE İŞLEM YAPILIYOR. ORJİNAL VERİ DEĞİŞEMEZ.

		int sayi; // bir atama yapmadığım için RAM de onun için yer ayrılmadı ama sonradan
					// kullanabilirim.

		// RAM'de iki farklı yerde iki farklı değişken tanımladık.
		int sayi1 = 5; // sayi1 5 sayısını tutuyor.
		int sayi2 = 10; // sayi2 10 sayısını tutuyor.

		sayi1 = sayi2; // sayi1 10 sayısını tutuyor.
		sayi1 = 20; // sayi1 20 sayısını tutuyor.
		// RAM'de iki farklı yerde tanımladık. Birinde yaptığımız değişiklik diğerini
		// etkilemez çünkü iki farklı yer var.
		System.out.println("sayi1: " + sayi1); // 20
		System.out.println("sayi2: " + sayi2); // 10

//		***reference data types*** --> ORİJİNAL VERİ DEĞİŞİR.

		// onu hold (refer) eden değişken tanımlarız = new ile RAM'de yer ayırır.

		// RAM'de iki farklı array tanımladık.
		int[] numbers1 = { 15, 25, 35, 45 };
//		int[] numbers1 = new int[] { 55, 65, 75, 85 }; //üstteki ile aynı
		int[] numbers2 = { 22, 33, 44, 55 };

		numbers2 = numbers1; // shallow(sığ) copy. numbers1'in refer ettiği array'i numbers2 de refer etsin
								// diyoruz. RAM'de bir tane kopya var ve ikisi de onu point ediyor.

		numbers1[0] = 5; // sadece bir tane kopya olduğu için birinde olan değişiklik diğerini de
							// etkiliyor.

		numbers2[1] = 3;

//		System.out.println("numbers1 0.indexi: " + numbers1[0]);
//		System.out.println("numbers2 0.indexi: " + numbers2[0]);
//
//		System.out.println("----------------------");
//		System.out.println("numbers1 1.indexi: " + numbers1[1]);
//		System.out.println("numbers2 1.indexi: " + numbers2[1]);
//
//		System.out.println("----------------------");
//		System.out.println("numbers1 2.indexi: " + numbers1[2]);
//		System.out.println("numbers2 2.indexi: " + numbers2[2]);

//		 ***orijinal verinin değişmemesini birinde olan değişikliğin diğerini
//		 etkilememesini istersek: deep(derin) copy.

		int[] n1 = { 15, 25, 35, 45 };
		int[] n2 = new int[n1.length];
		// n1'i traverse edip tek tek kopyaladık.
		for (int i = 0; i < n1.length; i++) { // deep(derin) copy
			n2[i] = n1[i]; // RAM'de artık iki farklı yer var.
		}
		for (int i = 0; i < n2.length; i++) {
//			System.out.println(n2[i]);
		}
		n1[1] = 48;
//		System.out.println(n2[1]);// 25 artık birinde yaptığım değişiklik diğerini etkilemiyor.

//		***WRAPPER CLASS*** (primitive data type'ı nasıl reference data type olarak
//		 tanımlayabiliriz?)

		int sayi3 = 55; // --> primtive data type
//		Integer sayi4 = new Integer(55); // --> reference data type
		// çok fazla nesne oluşturmak RAM'de performansı düşürür. ileri sürüm JAVA'larda
		// üst kısım çok fazla desteklenmiyor bu yüzden üstünü çiziyor.

//		***STRING*** stringler de birer arraydir.
//		String name1 = "abc def"; // alt satırdaki ile aynıdır.
		String name2 = new String("asd asd"); // RAM'de bir yer ayırdım name2 ile o yeri point(refer) ediyorum.
//		System.out.println(name1 + " " + name2);

		String name; // RAM'de kimseyi point etmiyor. uzun vadede RAM'e iade edilir.
		String firstName = "Furkan ";
		name = firstName + "Baysan";
		System.out.println(name);

		String fname = "Omer";
		String lname = "Tasci";

		fname = lname; // shallow(sığ) copy. RAM'de bir kopya(bir yer) var ama iki object referer de
						// aynı yeri point ediyor bu yüzden birinde olan değişiklik diğerini de
						// etkiliyor.

		System.out.println(fname + " " + lname);
		// String'de de deep copy yapılabilir.

		
	}
}
