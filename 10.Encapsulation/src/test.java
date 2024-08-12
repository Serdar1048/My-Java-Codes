import com.b.Calisan;


public class test {

	public static void main(String[] args) {
		Calisan calisan1 = new Calisan();
		
		calisan1.setId(15L);
		calisan1.setMaas(500);
		System.out.println("Çalışanın id'si: " + calisan1.getId());
		System.out.println("maaş: " + calisan1.getMaas());
		
		//değişkeni private ile sakladık.
		//set metodu ile erişip değer atadık.
		//get metodu ile değerine eriştik.

	}

}
