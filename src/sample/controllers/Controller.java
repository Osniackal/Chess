package sample.controllers;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.views.GameView;

public class Controller extends Application {
    @Override
    public void start(Stage primaryStage) {

        new GameView(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
