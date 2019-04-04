package sample.View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class StartWindow {

    public static void display1(String title, String message){

        Stage widow = new Stage();

        widow.initModality(Modality.APPLICATION_MODAL);
        widow.setTitle(title);

        VBox layout = new VBox(20);

        Label messageLabel = new Label();
        messageLabel.setText("GOMOKU");
        messageLabel.setId("message");
        messageLabel.setStyle("-fx-text-fill : green; -fx-font-size : 30; -fx-font : 100px Futura;");

        Label messageLabel1 = new Label();
        messageLabel1.setText("GAME START!!");
        messageLabel1.setId("message");
        messageLabel1.setStyle("-fx-text-fill : red; -fx-font-size : 30;");

        Label messageLabel2 = new Label();
        messageLabel2.setText(message);
        messageLabel2.setId("message");
        messageLabel2.setStyle("-fx-text-fill : black; -fx-font-size : 30;");

        Button okButton = new Button();
        okButton.setText("START");
        okButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                widow.close();
            }
        });

        layout.getChildren().add(messageLabel);
        layout.getChildren().add(messageLabel1);
        layout.getChildren().add(messageLabel2);
        layout.getChildren().add(okButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene  = new Scene(layout, 1440, 1030);
        scene.getStylesheets().add("sample/View/Css/popup.css");
        widow.setScene(scene);
        widow.showAndWait();
    }
}