package sample.models;

import sample.models.pieces.Piece;
import sample.util.Point;

public class ChessFieldModel {
    private Piece piece = null;
    private Point point;

    public ChessFieldModel(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
