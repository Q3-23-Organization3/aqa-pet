package homework9;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

    private static final Logger log = LogManager.getLogger(RockPaperScissors.class);

    public static void main(String[] args) throws PlayerMoveException {

        Scanner scanner = new Scanner(System.in);
        log.info("What's your move?");

        while (true) {
            String[] moves = {"ROCK", "PAPER", "SCISSORS"};
            String playerMove = scanner.nextLine().toUpperCase();

            try {
                validateMove(playerMove);
            } catch (PlayerMoveException e) {
                log.error("Not a valid move! Please, enter `ROCK`, `PAPER` or `SCISSORS` to play" + playerMove);
                continue;
            }

            Random random = new Random();
            int randomIndex = random.nextInt(moves.length);
            String computerMove = moves[randomIndex];
            log.info("Computer chose: " + computerMove);
            log.debug("******************");

            if (playerMove.equals(computerMove)) {
                log.info("It`s a tie! Keep playing to win!");
            } else if ((playerMove.equals("ROCK") && computerMove.equals("SCISSORS")) ||
                    (playerMove.equals("PAPER") && computerMove.equals("ROCK")) ||
                    (playerMove.equals("SCISSORS") && computerMove.equals("PAPER"))) {
                log.info("Congratulations! You win!");
            } else {
                log.info("Computer wins!");
            }

            log.debug("******************");
            log.info("What's your next move?");
        }
    }

    public static boolean validateMove(String playerMove) throws PlayerMoveException {
        if (!(playerMove.equals("ROCK") || playerMove.equals("PAPER") || playerMove.equals("SCISSORS"))) {
            throw new PlayerMoveException();
        }
        return false;
    }
}