import java.util.Scanner;
import java.util.Random;

public class codtask1 {
    public static void main(String[] args) {
        System.out.println("Number Gaming:-");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rangemin = 1;
        int rangemax = 100;
        int score = 0;
        int attemptsLimit = 7;
        boolean play = true;
        while (play) {
            int randomNum = random.nextInt(rangemax - rangemin + 1) + rangemin;
            int attempts = 0;
            boolean correctguess = false;
            System.out.println("\nSelected a number between " + rangemin + " and " + rangemax + ". Guess it!");
            while (attempts < attemptsLimit) {
                System.out.print("Enter your guessed num (Attempt " + (attempts + 1) + "): ");
                int usersguess = scanner.nextInt();
                attempts++;
                if (usersguess == randomNum) {
                    System.out.println(" You guessed a right number  " + attempts + " attempts.");
                    score += attempts;
                    correctguess = true;
                    break;
                } else if (usersguess < randomNum) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            if (!correctguess) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + randomNum);
            }
            System.out.print("Your current score: " + score + "\n\n");
            System.out.print("Wanna to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                play = false;
            }
        }
        System.out.println("Thanks and Your score is !  " + score);
        scanner.close();
    }
}
