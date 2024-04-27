package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

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
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getCols()];
        Position p = new Position(0, 0);

        //above

        p.setValues(position.getRow() -1 , position.getCol());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
            p.setRow(p.getRow() -1 );
        }
        if (getBoard().positionExists(p) && isThereAnyOpponentPiece(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        return matrix;
    }

}
