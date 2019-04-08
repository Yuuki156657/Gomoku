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

public class Popupwindow {
    public static void display(String title, String message){

        Stage widow = new Stage();

        widow.initModality(Modality.APPLICATION_MODAL);
        widow.setTitle(title);

        VBox layout = new VBox(20);
        Label messageLabel = new Label();
        messageLabel.setText(message);
        messageLabel.setId("message");
        messageLabel.setStyle("-fx-text-fill : blue; -fx-font-size : 40; -fx-font : 40px Futura;");

        Button againButton = new Button();
        againButton.setText("Again");
        againButton.setStyle("-fx-text-fill : black; -fx-font-size : 25;");
        againButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                widow.close();
            }
        });

        Button closeButton = new Button();
        closeButton.setText(" END ");
        closeButton.setStyle("-fx-text-fill : black; -fx-font-size : 25;");
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                widow.close();
                System.exit(0);
            }
        });

        layout.getChildren().add(messageLabel);
        layout.getChildren().add(againButton);
        layout.getChildren().add(closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene  = new Scene(layout, 400, 220);
        scene.getStylesheets().add("sample/View/Css/popup.css");
        widow.setScene(scene);
        widow.showAndWait();

    }
}