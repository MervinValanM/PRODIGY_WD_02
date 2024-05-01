import java.util.Random;
import java.util.Scanner;

public class  GuessTheNumberToWin{
    public static void main(String[] args) {
        System.out.println("Can you Guess the Number ?!!");
        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);

        int guessNumber = randomNumber.nextInt(100) + 1;
        int attemptCount = 0;

        while (true) {
            System.out.println("Enter a number between 1 to 100");
            int playersGuess = scanner.nextInt();
            attemptCount++;


            if (playersGuess == guessNumber) {
                System.out.println("Congratulations!!! Your Guess is correct and you won!");
                System.out.println("You took " + attemptCount + " attempts to WIN!");
                break;
            } else if (playersGuess > guessNumber) {
                System.out.println("OOPS! Your guess is higher, Guess again!");
            } else {
                System.out.println("OOPS! Your guess is lower, Guess again!");
            }
        }

        scanner.close();
    }
}