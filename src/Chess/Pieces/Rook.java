package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getRows()];
        return matrix;
    }
}
