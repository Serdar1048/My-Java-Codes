package model;

public class B extends C {
	public int bDegisken1;
	public int bDegisken2;

	public B() {
		System.out.println("B sınıfının yapıcısının içerisindeyiz");
	}

	public B(int bDegisken1) {
		super();
		this.bDegisken1 = bDegisken1;
	}

	public B(int bDegisken1, int bDegisken2) {
		super();
		this.bDegisken1 = bDegisken1;
		this.bDegisken2 = bDegisken2;
	}

	public void bSinifiMetodu() {
		System.out.println("B sınıfının içersindeki metotdayım.");

	}

}
