package SnakeAndLadder;

public class Block {

   private int number;
   private Snake snake;
   private Ladder ladder;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }
}
