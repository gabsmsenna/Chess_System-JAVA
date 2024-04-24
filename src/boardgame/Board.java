package boardgame;

public class Board {
    private int rows;
    private int cols;
    private Piece[][] pieces;

    public Board(int cols, int rows) {
        if (rows < 1 || cols < 1) {
            throw new BoardException("Board requires at least one row and column");
        }
        this.cols = cols;
        this.rows = rows;
        this.pieces = new Piece[rows][cols];
    }

    public Piece piece (int row, int col) {
        if (!positionExists(row, col)) {
            throw new BoardException("Board does not contain this position");
        }
        return pieces[row][col];
    }

    public Piece piece (Position pos) {
        if (!positionExists(pos)) {
            throw new BoardException("Board does not contain this position");
        }
        return pieces[pos.getRow()][pos.getCol()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece in this position --> (" + position + ")");
        }
        pieces[position.getRow()][position.getCol()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getCol());
    }

    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Board does not contain this position");
        }
        return piece(position) != null;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
}
