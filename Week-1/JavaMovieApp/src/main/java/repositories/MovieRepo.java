package repositories;

import models.Movie;

import java.util.List;

public interface MovieRepo {

    public Movie getMovie(int id);

    public List<Movie> getAllMovies();

    public Movie addMovie(Movie m);

    public Movie updateMovie(Movie change);

    public Movie deleteMovie(int id);

}