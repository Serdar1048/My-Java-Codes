package model;

public class A extends B {
	
	// super();
	// 1- kodların en üstünde olmalı.
	// 2- yapıcı metot içinde olmalı.

	public int aDegiskeni1;

	public int aDegiskeni2;

	public A() {
		super();
		System.out.println("A sınıfının yapıcısının içerisindeyiz");
	}

	public A(int aDegisken1, int aDegiskeni2) {
		super(aDegisken1, aDegiskeni2);
		
	}

	public void aSinifininMetodu() {
//		super(); //burada super() metotunu kullanamayız!!!
		System.out.println("A sınıfın içindeki metottayım.");
//		super.bSinifiMetodu(); // mirası veren kişi

	}
}
