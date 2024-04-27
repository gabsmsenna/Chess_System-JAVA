package Chess;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Invalid chess position. Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }
}
