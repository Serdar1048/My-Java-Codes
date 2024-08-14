import java.util.Scanner;

//güncelleştirme ve düzenleme gerekli********

public class Hangman {
	Scanner scanner = new Scanner(System.in);
	private String secretWord = "asdf";
	private char[] letters = new char[secretWord.length()];
	private int guessCount = 0, heart = 10;
	private boolean isFind = false;
	private String wrongLetter = "";

	public void play() {
		createArr();
		while (!isFind()) {
			System.out.print("Enter your letter: ");
			String letter = scanner.next();
			makeGuess(stringToChar(letter));
			print();
			arrayToString();
			winOrLose();
			if (guessCount == 10) {
				System.out.println("You Lost");
				break;
			}
		}
	}

	public void createArr() {
		for (int i = 0; i < secretWord.length(); i++) {
			letters[i] = '?';
		}
	}

	public void makeGuess(char c) {
		boolean found = false;
		for (int i = 0; i < secretWord.length(); i++) {

			if (secretWord.charAt(i) == (c)) {
				letters[i] = c;
				found = true;
			}
		}
// stringin içinde istediğim harfi arıyorum
		if (!found) {
			if (wrongLetter.indexOf(c) == -1) {
				wrongLetter += c;
			}
		}
		guessCount++;
	}

// diziyi tekraradan birleştirip bir kelime yapıyorum çünkü kelimler biribiribne eşitmi diye bakıcam
	public String arrayToString() {
		String xString = "";
		for (int i = 0; i < secretWord.length(); i++) {
			xString += letters[i];
		}
		return xString;
	}

	public void print() {
		for (int i = 0; i < secretWord.length(); i++) {
			System.out.print(letters[i]);
		}
		System.out.println();
		if (wrongLetter.length() > 0) {
			System.out.println("wrong Letters: " + wrongLetter);
		}
		System.out.println("Heart: " + --heart);
		System.out.println("------------------------------------------");
	}

	public void winOrLose() {
		if (secretWord.equals(arrayToString())) {
			isFind = true;
			System.out.println("You Win");
		}
	}

// stringi char a çevirdim
	public char stringToChar(String x) {
		return x.charAt(0);
	}

	public String getSecretWord() {
		return secretWord;
	}

	public int getGuessCount() {
		return guessCount;
	}

	public boolean isFind() {
		return isFind;
	}

}
