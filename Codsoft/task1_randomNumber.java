import java.util.Random;
import java.util.Scanner;

public class task1_randomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. You have 3 attempts to guess it.");

        int attempts = 0;
        boolean guessedCorrectly = false;
        
        while (attempts < 3) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }
        
        if (!guessedCorrectly) {
            System.out.println("Sorry, you did not guess the number. The correct number was: " + randomNumber);
        }
        
        scanner.close();
    }
}