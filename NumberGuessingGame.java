package sum;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1; // Minimum number for the guessing range
        int maxRange = 100; // Maximum number for the guessing range
        int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've generated a random number between " + minRange + " and " + maxRange + ". Try to guess it!");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;
            
            if (userGuess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > generatedNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + generatedNumber + " correctly in " + numberOfTries + " tries.");
                hasGuessedCorrectly = true;
            }
        }
        
        scanner.close();
		
	}

}
