
public class ArrayAsAReference {// Arrayler reference data type olduğu için orijinal veri ile işlem yaparız ve
								// bu yüzden ORİJİNAL VERİ DEĞİŞİR.
	public void changeTheArray(int[] array) {// --> aynı pass by reference mantığı

//		array = new int[] { 7, 8, 9 };// orijinal veri değişmesin istersek RAM'de başka bir alanı point etmemiz 
		// gerekir.
		array[0] = array[0] + 7;
	}
}
