package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getRows()];
        return matrix;
    }
}
