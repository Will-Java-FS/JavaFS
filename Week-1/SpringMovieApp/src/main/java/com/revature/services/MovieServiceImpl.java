package com.revature.services;

import com.revature.models.Actor;
import com.revature.models.Genre;
import com.revature.models.Movie;
import com.revature.models.MovieForm;
import com.revature.repositories.ActorRepo;
import com.revature.repositories.GenreRepo;
import com.revature.repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    MovieRepo mr;
    GenreRepo gr;
    ActorRepo ar;

    @Autowired
    public MovieServiceImpl(MovieRepo mr, GenreRepo gr, ActorRepo ar) {
        this.mr = mr;
        this.gr = gr;
        this.ar = ar;
    }

    @Override
    public Movie addMovie(Movie m) {

        m = mr.save(m);
        //make sure to save the new movies per actor.
        Movie movieToAdd = m;
        m.getActors().forEach(actor -> {
            actor.getMovies().add(movieToAdd);
            ar.save(actor);
        });

        return m;
    }

    @Override
    public Movie getMovie(int id) {
        return mr.findById(id).get();
    }

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>) mr.findAll();
    }

    @Override
    public Movie updateMovie(Movie change) {
        if(mr.findById(change.getId()).isPresent()) {
            return mr.save(change);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteMovie(int id) {
        try {
            mr.deleteById(id);
            return true;
        } catch (EmptyResultDataAccessException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Movie> getMoviesBelowPrice(double price) {
        return mr.findByPriceLessThan(price);
    }

    @Override
    public Movie checkout(Movie m) {

        Movie movie = getMovie(m.getId());
        if(movie == null || !movie.isAvailable()) return null;

        movie.setAvailable(false);
        movie.setReturnDate(System.currentTimeMillis() + (1000 * 60 * 60 * 24 * 14));

        return mr.save(movie);
    }

    @Override
    public Movie checkin(Movie m) {

        Movie movie = getMovie(m.getId());
        if(movie == null || movie.isAvailable()) return null;

        movie.setAvailable(true);
        movie.setReturnDate(0);

        return mr.save(movie);
    }

    @Override
    public Movie convertToMovie(MovieForm movieForm) {

        Movie m = new Movie();
        m.setId(movieForm.getId());
        m.setTitle(movieForm.getTitle());
        m.setPrice(movieForm.getPrice());
        m.setAvailable(movieForm.isAvailable());
        m.setReturnDate(movieForm.getReturnDate());

        List<Genre> genreList = gr.findByName(movieForm.getGenre());

        //Validate that a proper Genre was retrieved from the DB.
        if(genreList.size() == 0) {
            m.setGenre(null);
        } else {
            m.setGenre(genreList.get(0));
        }

        if(movieForm.getActors() == null || movieForm.getActors().length == 0) {
            m.setActors(new ArrayList<>());
        }  else {
            List<Actor> allActors = (List<Actor>) ar.findAll();
            m.setActors(allActors.stream()
                    .filter(x -> Arrays.asList(movieForm.getActors()).contains(x.getName()))
                    .collect(Collectors.toList()));
        }
        return m;

    }

    @Override
    public MovieForm convertToMovieForm(Movie m) {

        if(m == null) return null;

        MovieForm movieForm = new MovieForm();

        movieForm.setId(m.getId());
        movieForm.setTitle(m.getTitle());
        movieForm.setPrice(m.getPrice());
        movieForm.setAvailable(m.isAvailable());
        movieForm.setReturnDate(m.getReturnDate());
        movieForm.setGenre(m.getGenre().getName());

        if(m.getActors() != null) {
            movieForm.setActors(m.getActors().stream()
                    .map(a -> "/actors/" + a.getId())
                    .toArray(String[]::new));
        } else {
            movieForm.setActors(new String[0]);
        }
        return movieForm;
    }

    @Override
    public List<Movie> filterMoviesByTitle(String title, List<Movie> movies) {

        return movies.stream()
                .filter(x -> x.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    @Override
    public List<Movie> filterMoviesByPrice(double price, List<Movie> movies) {
        return movies.stream()
                .filter(x -> x.getPrice() == price)
                .collect(Collectors.toList());
    }

    @Override
    public List<Movie> filterMoviesByAvailable(boolean available, List<Movie> movies) {
        return movies.stream()
                .filter(x -> x.isAvailable() == available)
                .collect(Collectors.toList());
    }

    @Override
    public List<Actor> getActorsInMovie(Movie m) {

        List<Actor> actors = (List<Actor>) ar.findAll();

        return actors.stream()
                .filter(a -> a.getMovies().contains(m))
                .collect(Collectors.toList());

    }
}