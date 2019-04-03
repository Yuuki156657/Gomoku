package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("View/sample.fxml"));
        primaryStage.setTitle("GOMOKU");
        Scene boardScene = new Scene(root, 1440, 1030);

        boardScene.getStylesheets().add("sample/View/Css/styles.css");
        primaryStage.setScene(boardScene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
