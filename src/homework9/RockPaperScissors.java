package homework9;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) throws PlayerMoveException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your move?");

        while (true) {
            String[] moves = {"ROCK", "PAPER", "SCISSORS"};
            String playerMove = scanner.nextLine().toUpperCase();
            validateMove(playerMove);

            Random random = new Random();
            int randomIndex = random.nextInt(moves.length);
            String computerMove = moves[randomIndex];
            System.out.println("Computer chose: " + computerMove);
            System.out.println("******************");

            if (playerMove.equals(computerMove)) {
                System.out.println("It`s a tie! Keep playing to win!");
            } else if ((playerMove.equals("ROCK") && computerMove.equals("SCISSORS")) ||
                    (playerMove.equals("PAPER") && computerMove.equals("ROCK")) ||
                    (playerMove.equals("SCISSORS") && computerMove.equals("PAPER"))) {
                System.out.println("Congratulations! You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println("******************");
            System.out.println("What's your next move?");
        }
    }

    public static boolean validateMove(String playerMove) throws PlayerMoveException {
        if (!(playerMove.equals("ROCK") || playerMove.equals("PAPER") || playerMove.equals("SCISSORS"))) {
            throw new PlayerMoveException();
        }
        return false;
    }
}