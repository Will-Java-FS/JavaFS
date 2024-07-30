package com.revature.services;

import com.revature.models.Movie;

import java.util.List;

public interface MovieService {
    public Movie getMovie(int id);
    public List<Movie> getAllMovies();
}
