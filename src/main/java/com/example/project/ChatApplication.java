package com.example.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ChatApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Ежовый чат v.1.0 alpha!");

        VBox root = new VBox();

        for (int i = 0; i < 3; i++) {
            ChatBox c = new ChatBox();
            c.setDialog(new ChatDialog());
            root.getChildren().add(c);
        }

        Scene scene = new Scene(root, 320, 240);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}