package sample.views.nodes;

import javafx.scene.Group;

public class ChessboardNode extends BaseNode<Group> {

    private ChessFieldNode[][] map;

    public ChessboardNode() {
        super(new Group());

    }

    @Override
    public void draw(Group root) {
        //TODO: implement drawing method
//        map = new ChessFieldNode[BOARD_SIZE][BOARD_SIZE];
//        boolean fieldWhite = true;
//        for (int x = 0; x < BOARD_SIZE; x++) {
//            for (int y = 0; y < BOARD_SIZE; y++) {
//                map[x][y] = new ChessFieldNode(fieldWhite, x, y);
//                fieldWhite = !fieldWhite;
//            }
//            fieldWhite = !fieldWhite;
//        }
    }
}
