package com.abc;

public class Ogrenci {
	public int id; // değişken-field-property

	public String isim;

	public String soyisim;
	
	private String cinsiyet; // Sadece bu classtan erişebiliriz. Dış dünyaya kapalıdır.
	
	//method overloading -> parametrelerin tipi veya sayısı farklı olmalıdır.
	// birden fazla constructor method olabilir.
	public Ogrenci() { // ---> CONSTRUCTOR METHOD parametrsiz
		System.out.println("testtestset");
	}
	
	

	public Ogrenci (String cinsiyet) {
		this.cinsiyet = cinsiyet;
		System.out.println(cinsiyet);
	}
	
	public void cinsiyetYazdir() {
		System.out.println("Cinsiyeti: " + this.cinsiyet);
	}
	
	public Ogrenci(int id) { // ---> CONSTUCTOR METHOD parametreli
		System.out.println(id);
	}
	
	public Ogrenci(int id1, String isim1, String soyisim1) { // ---> CONSTRUCTOR METHOD parametreli
		//this --> şuan üzerinde çalıştığım class -> Ogrenci classı
		this.id = id1;
		this.isim = isim1;
		this.soyisim = soyisim1;
	}
}