package sample.views;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public abstract class BaseView<T extends Pane> extends Scene {

    protected Stage parentStage;

    public BaseView(Stage parentStage, T root, double width, double height) {
        super(root , width, height);
        this.parentStage = parentStage;
        if (build(root)) {
            displayView(this);
        }
    }

    protected abstract boolean build(T root);

    public void displayView(BaseView view) {
        parentStage.setScene(view);
    }
}
