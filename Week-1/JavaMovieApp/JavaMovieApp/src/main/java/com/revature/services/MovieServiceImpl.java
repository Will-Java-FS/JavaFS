package com.revature.services;

import com.revature.models.Movie;
import com.revature.repositories.MovieRepo;

import java.util.List;

public class MovieServiceImpl implements MovieService{

    private MovieRepo mr;

    public MovieServiceImpl(MovieRepo mr){
        this.mr=mr;
    }

    @Override
    public Movie getMovie(int id) {
        return mr.getMovie(id);
    }

    @Override
    public List<Movie> getAllMovies() {
        return null;
    }
}
