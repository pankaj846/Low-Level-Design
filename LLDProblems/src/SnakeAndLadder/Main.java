package SnakeAndLadder;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
        System.out.println(game.getWinners());
    }
}
