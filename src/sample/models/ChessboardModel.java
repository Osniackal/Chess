package sample.models;

import sample.controllers.UserActions;
import sample.util.Point;

import static sample.util.Settings.BOARD_SIZE;

public class ChessboardModel implements UserActions {
    private ChessFieldModel map[][] = new ChessFieldModel[BOARD_SIZE][BOARD_SIZE];

    public ChessboardModel() {
        for (int x = 0; x < BOARD_SIZE; x++) {
            for (int y = 0; y < BOARD_SIZE; y++) {
                map[x][y] = new ChessFieldModel(Point.getInstance(x, y));
            }
        }
        reset();
    }

    @Override
    public void reset() {

    }

    @Override
    public boolean move(Point from, Point to) {
        return false;
    }

    @Override
    public void turn() {

    }

    public ChessFieldModel getField(Point p) {
        return map[p.getX()][p.getY()];
    }


}
