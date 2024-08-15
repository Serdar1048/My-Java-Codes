
public class Species {

	private int population, area, year;
	private double populationDensity, growthRate;

	public Species(int population, double growthRate, int area) {
		this.population = population;
		this.growthRate = growthRate;
		this.area = area;
		this.populationDensity = population / area;
	}

	public void increment() {

		while (populationDensity <= 0.01) {
			population += population * growthRate;
			populationDensity = population / area;
			year++;
		}
		System.out.println(year);
	}

}

//
//public class Species {
//    public static void main(String[] args) {
//        // Verilen değerler
//        int initialPopulation = 100;
//        double growthRate = 0.15; // %15
//        int area = 1500; // square miles
//        
//        // Başlangıç nüfus yoğunluğunu hesapla
//        double initialDensity = (double) initialPopulation / area;
//        
//        // Hedef nüfus yoğunluğunu belirle (1 kişi/mil kare)
//        double targetDensity = 1.0;
//        
//        // Geçen yılları sayacak değişken
//        int years = 0;
//        
//        // Nüfus yoğunluğu hedefe ulaşana kadar döngüyü çalıştır
//        while (initialDensity <= targetDensity) {
//            // Nüfusu güncelle
//            initialPopulation += (int) (initialPopulation * growthRate);
//            // Yoğunluğu güncelle
//            initialDensity = (double) initialPopulation / area;
//            // Yılı artır
//            years++;
//        }
//        
//        // Sonucu ekrana yazdır
//        System.out.println("Nüfus yoğunluğu 1 kişi/mil kareyi aştığı zaman geçen yıl: " + years);
//    }
//}
//
