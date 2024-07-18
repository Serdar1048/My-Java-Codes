import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int number = rnd.nextInt(0, 100);
        System.out.println("Hi! I am thinking of a number between 0 and 100");
        System.out.print("Can you guess it : ");

        int guess = sc.nextInt();
        int counter = 1;

        while (guess != -1 && guess != number) {
            System.out.println("Sorry!");
            if (guess < number) {
                System.out.println("Mine is greater than yours!");

            } else {
                System.out.println("Mine is less than yours!");
            }
            System.out.println("Type -1 to exit or gguess again");
            guess = sc.nextInt();
            counter++;
        }
        if (guess == number) {
            System.out.println("Congratulations ! You won after " + counter + " steps.");

        } else {
            System.out.println("The number was " + number);
        }
        sc.close();

    }
}
