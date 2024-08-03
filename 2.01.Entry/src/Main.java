
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		// !! IMPORTANT !!
		car1 = car2;
		System.out.println(car1);
		System.out.println(car2);
		

		car1.brand = "Ford";
		car2.brand = "Renault";

		car1.model = "Focus";
		car2.model = "Megane";

		car1.color = "black";
		car2.color = "grey";
		
		car1.price = 120000;
		car2.price = 100000;
		
		car1.printStates();
		car2.printStates();
		
		car1.speed = 100; //initial speed
		car2.speed = 130; //initial speed
		
		car1.speedUp(50);
		car2.speedUp(70);
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		
		car1.applyBrakes(60);
		car2.applyBrakes(20);
		System.out.println(car1.speed);
		System.out.println(car2.speed);
	}

}
