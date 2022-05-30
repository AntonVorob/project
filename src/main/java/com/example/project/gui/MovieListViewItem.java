package com.example.project.gui;

import com.example.project.movies.Movie;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class MovieListViewItem extends HBox {

    // подтянуть названия графических элементов
    @FXML
    Label nameTitle;

    MovieListViewItem() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("MovieListViewItem.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setMovie(Movie m) {
        // TODO: сетТекст, заполнить графические элементы данными из объекта Фильма
        this.nameTitle.setText(m.getNameRU());
    }

}
