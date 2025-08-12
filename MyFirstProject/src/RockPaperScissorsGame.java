import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("What will you show? (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid move, please try again");
                continue; // Go back to the beginning instead of running through the program with an invalid choice
            }

            computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer shows: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors")) && computerChoice.equals("paper")) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }

            System.out.println();
            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
            System.out.println();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
