
public abstract class BaseScoreCalculator {// bu class'tan nesne oluşturamayız çünkü abstract.
	public abstract void scoreCalculate(); // prototip olarak tanımladık.

	public final void gameOver() { // bu metodu subclasslar override edemez çünkü 'final' tanımladık.
		System.out.println("Oyun bitti");
	}

}
