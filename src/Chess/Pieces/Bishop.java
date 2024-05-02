package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Bishop extends ChessPiece {
    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getCols()];
        Position p = new Position(0, 0);

        //NW
        p.setValues(position.getRow() - 1 , position.getCol() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
            p.setValues(p.getRow() - 1 , p.getCol() - 1);
        }
        if (getBoard().positionExists(p) && isThereAnyOpponentPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //NE

        p.setValues(position.getRow() - 1, position.getCol() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
            p.setValues(p.getRow() - 1, p.getCol() + 1);
        }
        if (getBoard().positionExists(p) && isThereAnyOpponentPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //SE

        p.setValues(position.getRow() + 1, position.getCol()  + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
            p.setValues(p.getRow() + 1, p.getCol() + 1);
        }
        if (getBoard().positionExists(p) && isThereAnyOpponentPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //SW

        p.setValues(position.getRow() + 1, position.getCol() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
            p.setValues(p.getRow() + 1, p.getCol() - 1);
        }
        if (getBoard().positionExists(p) && isThereAnyOpponentPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        return matrix;
    }

    @Override
    public String toString() {
        return "B";
    }
}
