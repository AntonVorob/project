package com.example.project.movies;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieService {

    public ArrayList<ChatDialog> getMovies() {
        ChatDialog A = new ChatDialog();
        A.name = "Hermione";
        A.message = "It's leviOsa, not leviosA!";

        ChatDialog B = new ChatDialog();
        B.name = "Margarita";
        B.message = "It is vodka, isn't it?";

        ArrayList<ChatDialog> movies = new ArrayList<ChatDialog>();
        movies.add(A);
        movies.add(B);
        return movies;

    }

}
