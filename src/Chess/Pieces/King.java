package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean canMove(Position position) {
     ChessPiece p = (ChessPiece)getBoard().piece(position);
     return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getCols()];
        Position p = new Position(0, 0);

        //above
        p.setValues(position.getRow() -1, position.getCol());
        if (getBoard().positionExists(p) && canMove(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //below
        p.setValues(position.getRow() +1, position.getCol());
        if (getBoard().positionExists(p) && canMove(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //left
        p.setValues(position.getRow(), position.getCol() -1);
        if (getBoard().positionExists(p) && canMove(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //right
        p.setValues(position.getRow(), position.getCol() +1);
        if (getBoard().positionExists(p) && canMove(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //nw
        p.setValues(position.getRow()-1, position.getCol() -1);
        if (getBoard().positionExists(p) && canMove(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //ne
        p.setValues(position.getRow()-1, position.getCol() +1);
        if (getBoard().positionExists(p) && canMove(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //sw
        p.setValues(position.getRow()+1, position.getCol() -1);
        if (getBoard().positionExists(p) && canMove(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        //se
        p.setValues(position.getRow()+1, position.getCol() +1);
        if (getBoard().positionExists(p) && canMove(p)) {
            matrix[p.getRow()][p.getCol()] = true;
        }

        return matrix;
    }
}
