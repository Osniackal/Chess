package sample.views;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sample.util.Settings;
import sample.views.nodes.ChessboardNode;

public class GameView extends BaseView<StackPane> {

    public GameView(Stage parentStage) {
        super(parentStage, new StackPane(), Settings.GAME_VIEW_WIDTH, Settings.GAME_VIEW_HEIGHT);
    }

    @Override
    protected boolean build(StackPane root) {
        root.getChildren().addAll(
               new ChessboardNode()
        );

        parentStage.setTitle("Chess");
        parentStage.show();
        return true;
    }
}
