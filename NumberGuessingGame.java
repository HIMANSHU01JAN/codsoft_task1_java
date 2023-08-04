import java.util.Scanner;
import java.util.Random;

    public class NumberGuessingGame {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int minRange = 1;
            int maxRange = 100;
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int userGuess;
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a random number between " + minRange + " and " + maxRange + ".");

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > generatedNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + generatedNumber + " in " + attempts + " attempts.");
                }
            } while (userGuess != generatedNumber);

            scanner.close();
        }
    }


