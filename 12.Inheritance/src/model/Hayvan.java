package model;

public class Hayvan { //üst class (super class) --> mirası veren class
	public Long id;

	public String hayvanIsmi;

	public int yas;
	
	//protected hem bulunduğu class içerisinde hem de miras alan class içerisinden erişilebilir.
	protected String renk; 

	protected int ayakSayisi;
	
	public void sesVer() {
		System.out.println("Hayvan ses veriyor..");
	}

	
	
}
