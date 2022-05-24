package com.example.project.movies;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class MovieCard extends HBox {

    @FXML
    Label nameTitle;

    public MovieCard() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("cardOfFilms.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMovieName(String s) {
        this.nameTitle.setText(s);
    }


}
