package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.services.MovieService;
import com.revature.models.Movie;
import io.javalin.http.Handler;

import java.util.List;

public class MovieController {

    private MovieService ms;
    private Gson gson = new Gson();

    public MovieController(MovieService ms){
        this.ms=ms;
    }

    public Handler getAllMovies = (context)-> {
        List<Movie> movies = ms.getAllMovies();
        String moviesJSON =gson.toJson(movies);
        context.result(moviesJSON);
        };

    public Handler getMovieByID = (context)->{
        int id =Integer.parseInt(context.pathParam("id"));
        Movie m = ms.getMovie(id);
        context.result(gson.toJson(m));
    };
}
