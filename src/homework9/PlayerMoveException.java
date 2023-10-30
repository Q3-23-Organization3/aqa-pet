package homework9;

public class PlayerMoveException extends Exception {
    public PlayerMoveException(){
        super("Not a valid move! Please, enter `ROCK`, `PAPER` or `SCISSORS` to play");
    }
}
