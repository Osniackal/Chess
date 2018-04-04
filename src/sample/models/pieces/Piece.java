package sample.models.pieces;

import sample.util.Point;

import java.util.List;

public abstract class Piece {
    private boolean white;
    private Point cords;

    public Piece(boolean white, Point cords) {
        this.white = white;
        this.cords = cords;
    }

    public abstract List<Point> generateMovePoints();

    public boolean canMoveTo(Point p) {
        return generateMovePoints().contains(p);
    }
}
