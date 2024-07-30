package controllers;

import com.google.gson.Gson;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import models.Movie;
import services.MovieService;

import java.util.List;

public class MovieController {

    private MovieService ms;
    private Gson gson = new Gson();

    public MovieController(MovieService ms) {
        this.ms = ms;
    }

    public Handler getAllMovies = (context) -> {

        List<Movie> movies = ms.getAllMovies();
        String moviesJSON = gson.toJson(movies);
        //You pass information through result() to send information back (response)
        context.result(moviesJSON);
    };

    public Handler getMovieById = (context) -> {

        int id = Integer.parseInt(context.pathParam("id"));
        Movie m = ms.getMovie(id);
        context.result(gson.toJson(m));
    };

    public Handler createMovie = (context) -> {
        Movie m = gson.fromJson(context.body(), Movie.class);

        m = ms.addMovie(m);
        context.result(gson.toJson(m));
    };

    public void anotherHandle(Context ctx) {
        ctx.result("Another example");
    }

}