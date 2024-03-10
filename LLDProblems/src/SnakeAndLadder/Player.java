package SnakeAndLadder;

public class Player {
    private int playerId;

    private int playerPosition;

    Player(int playerId){
        this.playerId = playerId;
        this.playerPosition = 1; // by default position is 1
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerPosition=" + playerPosition +
                '}';

//        return " " + playerId + " ";
    }
}
