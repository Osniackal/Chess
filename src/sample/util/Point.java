package sample.util;


import static sample.util.Settings.BOARD_SIZE;

public class Point {
    private static Point[][] points = new Point[BOARD_SIZE][BOARD_SIZE];

    public static Point getInstance(int x, int y) {
        if (points[x][y] == null) {
            points[x][y] = new Point(x, y);
        }
        return points[x][y];
    }

    private int x, y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
