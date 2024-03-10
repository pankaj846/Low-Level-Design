package SnakeAndLadder;

public class Board {

    private int rows, cols;
    private Block[][] blocks;

//    Cells cells;
    public Board(int row, int col, int noOfSnakes, int noOfLadder){
        this.rows = row;
        this.cols = col;
        blocks = new Block[row+2][col+2];

        // Always remember, if one class has another class, first initialize it with new()
        for(int i=0; i<=row+1; i++)
            for(int j=0; j<=col+1; j++){
                blocks[i][j] = new Block();
            }

        initialize(noOfSnakes, noOfLadder);
    }

    private void initialize(int noOfSnakes, int noOfLadders){

        // Set Snakes
        blocks[5][3].setSnake(new Snake(44, 21));
        blocks[10][9].setSnake(new Snake(99, 5));
        blocks[8][8].setSnake(new Snake(78, 34));

        // Set Ladder
        blocks[1][9].setLadder(new Ladder(8, 45));
        blocks[4][9].setLadder(new Ladder(39, 88));
        blocks[6][6].setLadder(new Ladder(56, 95));
    }

    public int getNewPositionAfterSnakeLadder(int currentPosition){

        int currentRow = currentPosition / cols + 1;
        int currentCol = currentPosition % cols;
//        System.out.println(currentRow + " : " + currentCol);
        if(blocks[currentRow][currentCol].getSnake()!=null){
            System.out.println("Oh,You've got Snake");
            return blocks[currentRow][currentCol].getSnake().getEndPosition();
        }
        else if(blocks[currentRow][currentCol].getSnake()!=null){
            System.out.println("Wow, you've got Ladder!!");
            return blocks[currentRow][currentCol].getSnake().getEndPosition();
        }

        return currentPosition;
    }

}
