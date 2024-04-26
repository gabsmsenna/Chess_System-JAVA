package Chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Invalid position. Valid values are a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    protected Position toPosition() {
        // matriz_row = 8 - chess_row
        // matrix_col = chess_column - 'a'
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' - position.getCol()), (8 - position.getRow()));
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}
