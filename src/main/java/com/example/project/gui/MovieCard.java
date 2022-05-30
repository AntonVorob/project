package com.example.project.gui;

import com.example.project.movies.Movie;
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

    // TODO:
    public void setMovie(Movie m) {
        this.nameTitle.setText(m.getNameRU());
    }
    public void setMovieName(String s) {
        this.nameTitle.setText(s);
    }


}
