package SnakeAndLadder;

import java.util.LinkedList;
import java.util.Queue;

public class Game {

    // for playing a game, we've players, board, dice so let's take them

    private Player player;
    private Dice dice;
    private Board board;

    private Queue<Player> players;
    private Queue<Player> winners;

    Game(){
        // initialize all fields and objects

        Player player1 = new Player(1); // by default player starts with position 1
        Player player2 = new Player(2);
        Player player3 = new Player(3);

        dice = new Dice();
        dice.setDiceCount(1);

        // take board of 10*10 matrix
        board = new Board(10, 10, 4, 4);

        // add players in the queue
        players = new LinkedList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        winners = new LinkedList<>();
    }

    public void play() {

        // play until all players get win
        while (!players.isEmpty()) {

            Player currentPlayer = players.remove();

            int jump = dice.roll();
//            System.out.println(jump);
            System.out.println("PlayerId and Position => " + currentPlayer.getPlayerId() + " : " + currentPlayer.getPlayerPosition());

            // postion of player after jump
            currentPlayer.setPlayerPosition(currentPlayer.getPlayerPosition() + jump);

            // check if there is snake or ladder => 45 => row= 5 col = 5
            int updatedPos = board.getNewPositionAfterSnakeLadder(currentPlayer.getPlayerPosition());

            // update postion after snaker and ladder
            currentPlayer.setPlayerPosition(updatedPos);

            players.add(currentPlayer);

//            System.out.println(currentPlayer.getPlayerPosition());

            if (currentPlayer.getPlayerPosition() >= 100) {
                winners.add(currentPlayer);
                players.remove(currentPlayer);
            }
        }

    }

    public Queue<Player> getWinners() {
        return winners;
    }
}
