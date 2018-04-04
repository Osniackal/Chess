package sample.views.nodes;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;

import static sample.util.Settings.BOARD_SIZE;

public class Chessboard extends BaseNode<Group> {

    private ChessField[][] map;

    public Chessboard() {
        super(new Group());
        map = new ChessField[BOARD_SIZE][BOARD_SIZE];

    }

    @Override
    public void draw(Group root) {
        //TODO: implement drawing method
//        boolean fieldWhite = true;
//        for (int x = 0; x < BOARD_SIZE; x++) {
//            for (int y = 0; y < BOARD_SIZE; y++) {
//                map[x][y] = new ChessField(fieldWhite, x, y);
//                fieldWhite = !fieldWhite;
//            }
//            fieldWhite = !fieldWhite;
//        }
    }
}
