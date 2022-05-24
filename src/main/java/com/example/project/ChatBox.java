package com.example.project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextFlow;

import java.io.File;

public class ChatBox extends HBox {

    @FXML
    Label nameTitle;

    @FXML
    ImageView avatarThumbnail;

    @FXML
    TextArea messageText;

   public ChatBox() {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("chatbox.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDialog(ChatDialog d) {
        Image image = new Image(getClass().getResource("puppy.jpg").toString());
        this.avatarThumbnail.setImage(image);
        this.nameTitle.setText(d.name);
        this.messageText.setText(d.message);
    }


}
