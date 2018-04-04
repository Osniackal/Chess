package sample.views.nodes;

import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import sample.util.Settings;

public class ChessFieldNode extends BaseNode<Group> {

    private final boolean white;
    private final double x, y;

    public ChessFieldNode(boolean white, double x, double y) {
        super(new Group());
        this.white = white;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Group root) {
        Rectangle rectangle = new Rectangle(x, y, 50, 50);
        rectangle.setFill(white ? Settings.WHITE : Settings.BLACK);
        root.getChildren().setAll(rectangle);
    }
}
