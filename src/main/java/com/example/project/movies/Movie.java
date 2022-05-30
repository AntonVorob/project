package com.example.project.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    String nameRU;
    String nameEN;
    String PosterURL;
    String Genres;
    int years;
    double ratingKinopoisk;
    String shortDescription;
    String country;
    String webUrl;

//

    public Movie(String nameRU, String nameEN, String posterURL, String genres, int years, double ratingKinopoisk, String shortDescription, String country, String webUrl) {
        this.nameRU = nameRU;
        this.nameEN = nameEN;
        PosterURL = posterURL;
        Genres = genres;
        this.years = years;
        this.ratingKinopoisk = ratingKinopoisk;
        this.shortDescription = shortDescription;
        this.country = country;
        this.webUrl = webUrl;
    }

    public Movie(String nameRu) {
        this.nameRU = nameRu;
    }

    public Movie() {

    }

    public String getNameRU() {
        return nameRU;
    }

    public String getNameEN() {
        return nameEN;
    }

    public String getPosterURL() {
        return PosterURL;
    }

    public String getGenres() {
        return Genres;
    }

    public int getYears() {
        return years;
    }

    public double getRatingKinopoisk() {
        return ratingKinopoisk;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getCountry() {
        return country;
    }

    public String getWebUrl() {
        return webUrl;
    }
}
