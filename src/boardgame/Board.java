package boardgame;

public class Board {
    private int rows;
    private int cols;
    private Piece[][] pieces;

    public Board(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.pieces = new Piece[rows][cols];
    }

    public Piece piece (int row, int col) {
        return pieces[row][col];
    }

    public Piece piece (Position pos) {
        return pieces[pos.getRow()][pos.getCol()];
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
