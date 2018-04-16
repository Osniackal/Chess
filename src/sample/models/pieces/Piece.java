package sample.models.pieces;

import sample.util.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents a chess piece
 */
public abstract class Piece {
    private boolean white;
    private Point cords;
    private boolean jump;
    protected LinearFunction[] linearFunctions;

    /**
     * Creates a new instance of a chess piece
     * @param white Whether the piece is white or not
     * @param cords The coordinates of the piece
     */
    Piece(boolean white, Point cords, boolean jump) {
        this.white = white;
        this.cords = cords;
    }

    /**
     * Builds a List containing all points a piece can go,
     * it can also return Points where other Pieces are standing or which other pieces
     * are blocking
     * @return The List of Points the Piece can go to
     */
    abstract List<Point> generateMovePoints(List<Point> emptyListOfPointsToFill);

    public List<Point> generateMovePoints() {
        return generateMovePoints(new ArrayList<>());
    }

    /**
     * Checks if the List of the points the piece can move the given point
     * @param p A point
     * @return if the piece can move to the point or not
     */
    public boolean canMoveTo(Point p) {
        return generateMovePoints().contains(p);
    }

    public abstract boolean canJump();
}
