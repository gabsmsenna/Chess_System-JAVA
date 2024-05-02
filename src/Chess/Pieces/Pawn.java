package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getCols()];
        Position p = new Position(0, 0);

        if (getColor() == Color.WHITE ) {

            p.setValues(position.getRow() -1, position.getCol());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                matrix[p.getRow()][p.getCol()] = true;
            }

            p.setValues(position.getRow() -2, position.getCol());
            Position p2 = new Position(position.getRow() -1, position.getCol());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                matrix[p.getRow()][p.getCol()] = true;
            }

            p.setValues(position.getRow() -1, position.getCol() -1);
            if (getBoard().positionExists(p) && isThereAnyOpponentPiece(p)) {
                matrix[p.getRow()][p.getCol()] = true;
            }

            p.setValues(position.getRow() -1, position.getCol() +1);
            if (getBoard().positionExists(p) && isThereAnyOpponentPiece(p)) {
                matrix[p.getRow()][p.getCol()] = true;
            }
        }
        else {
            p.setValues(position.getRow() +1, position.getCol());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                matrix[p.getRow()][p.getCol()] = true;
            }

            p.setValues(position.getRow() +2, position.getCol());
            Position p2 = new Position(position.getRow() +1, position.getCol());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                matrix[p.getRow()][p.getCol()] = true;
            }

            p.setValues(position.getRow() +1, position.getCol() -1);
            if (getBoard().positionExists(p) && isThereAnyOpponentPiece(p)) {
                matrix[p.getRow()][p.getCol()] = true;
            }

            p.setValues(position.getRow() +1, position.getCol() +1);
            if (getBoard().positionExists(p) && isThereAnyOpponentPiece(p)) {
                matrix[p.getRow()][p.getCol()] = true;
            }
        }
        return matrix;
    }
    @Override
    public String toString() {
        return "P";
    }
}
