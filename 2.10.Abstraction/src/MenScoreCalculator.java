
public class MenScoreCalculator extends BaseScoreCalculator {// BaseScoreCalculator class'ını inherit ettiğimiz için ve
																// BaseScoreCalculator class'ı abstract olduğu için ve
																// bu clasas'ın içerisindeki scoreCalculate() metotu da
																// abstract olduğu için MenScoreCalculator class'ında
																// scoreCalculate() metodunu override etmek zorundayım.

//	***OVERRIDING***
	public void scoreCalculate() {
		System.out.println("Your score: " + 90);
	}

}
