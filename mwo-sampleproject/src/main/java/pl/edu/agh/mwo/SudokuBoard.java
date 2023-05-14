package pl.edu.agh.mwo;

    public class SudokuBoard {

    public static final int BOARD_SIZE = 9;

    private int[][] board;

    public SudokuBoard(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }
}

