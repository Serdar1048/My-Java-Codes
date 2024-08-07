
public class Araba {
	public String model;
	public int uretimYili;
	
	public Araba(String model) {
		System.out.println("nesne üretiliyor");
		this.model = model;
		System.out.println("Araba modeli: " + model);
	}
	public Araba(String model,int uretimYili) {
		this.model = model;
		this.uretimYili = uretimYili;
		System.out.println(model);
		System.out.println(uretimYili);
		
	}
	public void arabayiYazdir() {
		System.out.println("Araba modeli: " + model);
	}
}
