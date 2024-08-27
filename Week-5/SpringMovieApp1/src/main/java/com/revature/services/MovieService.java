package com.revature.services;

import com.revature.models.Actor;
import com.revature.models.Movie;
import com.revature.models.MovieForm;

import java.util.List;

public interface MovieService {

    //Trivial Services
    public Movie addMovie(Movie m);
    public Movie getMovie(int id);
    public List<Movie> getAllMovies();
    public Movie updateMovie(Movie change);
    public boolean deleteMovie(int id);

    public List<Movie> getMoviesBelowPrice(double price);

    public Movie checkout(Movie m);
    public Movie checkin(Movie m);

    public Movie convertToMovie(MovieForm movieForm);
    public MovieForm convertToMovieForm(Movie m);

    public List<Movie> filterMoviesByTitle(String title, List<Movie> movies);
    public List<Movie> filterMoviesByPrice(double price, List<Movie> movies);
    public List<Movie> filterMoviesByAvailable(boolean available, List<Movie> movies);

    public List<Actor> getActorsInMovie(Movie m);

}