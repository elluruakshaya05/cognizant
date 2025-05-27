import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1; // Random number from 1 to 100
        int guess;

        System.out.println("Guess the number between 1 and 100!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > target) {
                System.out.println("Too high!");
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        } while (guess != target);

        scanner.close();
    }
}
