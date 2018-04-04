package sample.controllers;

import sample.util.Point;

public interface UserActions {
    void reset();
    boolean move(Point from, Point to);
    void turn();
}
