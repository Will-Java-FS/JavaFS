package services;

import models.Movie;
import repositories.MovieRepo;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    private MovieRepo mr;

    public MovieServiceImpl(MovieRepo mr) {
        this.mr = mr;
    }

    @Override
    public Movie getMovie(int id) {
        return mr.getMovie(id);
    }

    @Override
    public List<Movie> getAllMovies() {
        return mr.getAllMovies();
    }

    @Override
    public Movie addMovie(Movie m) {
        return mr.addMovie(m);
    }

    @Override
    public Movie updateMovie(Movie change) {
        return mr.updateMovie(change);
    }

    @Override
    public Movie deleteMovie(int id) {
        return mr.deleteMovie(id);
    }

    @Override
    public Movie checkout(int id) {
        return null;
    }

    @Override
    public Movie checkin(int id) {
        return null;
    }
}