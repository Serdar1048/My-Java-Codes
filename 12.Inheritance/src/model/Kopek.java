package model;

public class Kopek extends Hayvan {

	 // alt class (sub class) --> mirası alan class

	// bu boş kısımda erieşemeyiz metot içerisinde erişmemiz gerek.

//	public void test() { //bu şekilde bir metot içerisinde erişebiliriz.
////		renk // protected olarak tanımlandığı için buradan erişilebiliyor çünkü miras aldı.
//	}
//	
//	public Kopek() {
////		renk
//	}

//  **************************************************************************
	
	@Override
	public void sesVer() {
		super.sesVer();
		System.out.println("Köpek ses veriyor");
	}
}
