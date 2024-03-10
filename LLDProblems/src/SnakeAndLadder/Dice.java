package SnakeAndLadder;

public class Dice {
    private int diceCount;
    public int roll(){

        // random calculation for number
        return 1 + (int) (Math.random() * (6));
    }

    public int getDiceCount() {
        return diceCount;
    }

    public void setDiceCount(int diceCount) {
        this.diceCount = diceCount;
    }
}
