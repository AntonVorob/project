package com.example.project.movies;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

@Component
public class MovieService {

    public ArrayList<Movie> getMovies() {
        // TODO:
        return new ArrayList<>();
    }


    public String[] findMovies(String s) {

        try {

            URL url = new URL("https://kinopoiskapiunofficial.tech/api/v2.1/films/search-by-keyword?" +
                    "keyword=" + URLEncoder.encode(s, StandardCharsets.UTF_8) +
                    "&page=1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("X-API-KEY", "79309bde-6cab-48d6-a717-e633cf5fbc89");

            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(conn.getInputStream());
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
                scanner.close();
                JSONObject response = new JSONObject(inline);

                // Здесь в бой вступаем МЫ!
                JSONArray movies = (JSONArray) response.get("films");
                for (int i = 0; i < movies.length(); i++) {
                    System.out.println(movies.getJSONObject(i).getString("nameRu"));
                }

            }

            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new String[]{};

    }

}
