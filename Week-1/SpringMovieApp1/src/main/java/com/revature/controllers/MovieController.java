package com.revature.controllers;

import com.revature.models.Command;
import com.revature.models.Movie;
import com.revature.models.MovieForm;
import com.revature.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieController {

    MovieService ms;

    @Autowired
    public MovieController(MovieService ms) {
        this.ms = ms;
    }

    @GetMapping("/movies")
    public List<MovieForm> getAllMovies() {
        System.out.println("Getting All Movies");
        return ms.getAllMovies().stream()
                .map(m -> ms.convertToMovieForm(m))
                .collect(Collectors.toList());
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<MovieForm> getMovieById(@PathVariable String id) {

        try {
            int num = Integer.parseInt(id);
            Movie m = ms.getMovie(num);
            return new ResponseEntity<>(ms.convertToMovieForm(m), HttpStatus.OK);
        } catch(NumberFormatException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/movies/search")
    public ResponseEntity<List<MovieForm>> getFilteredMovies(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) Double price,
            @RequestParam(required = false) Boolean available) {

        //Start with retrieving all Movies.
        List<Movie> movies = ms.getAllMovies();

        //Then filter per query param provided.
        //Filter by Title if it was provided as a Query Param.
        if(title != null) movies = ms.filterMoviesByTitle(title, movies);
        //Filter by Price if it was provided as a Query Param.
        if(price != null) movies = ms.filterMoviesByPrice(price, movies);
        //Filter by Available if it was provided as a Query Param.
        if(available != null) movies = ms.filterMoviesByAvailable(available, movies);


        //The final filtered list.

        //Convert to List<MovieForm> first.
        List<MovieForm> movieForms = movies.stream()
                .map(m -> ms.convertToMovieForm(m))
                .collect(Collectors.toList());
        return new ResponseEntity<>(movieForms, HttpStatus.OK);

    }


    @PostMapping("/movies")
    public ResponseEntity<MovieForm> addMovie(@RequestBody MovieForm movieForm) {
        Movie m = ms.convertToMovie(movieForm);
        m = ms.addMovie(m);
        return new ResponseEntity<>(ms.convertToMovieForm(m), HttpStatus.CREATED);
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<MovieForm> updateMovie(@RequestBody MovieForm movieForm, @PathVariable int id) {
        movieForm.setId(id);
        Movie change = ms.convertToMovie(movieForm);
        change = ms.updateMovie(change);

        if(change != null) {
            return new ResponseEntity<>(ms.convertToMovieForm(change), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }


    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Boolean> deleteMovie(@PathVariable int id) {
        boolean wasDeleted = ms.deleteMovie(id);
        return new ResponseEntity<>(wasDeleted, (wasDeleted) ? HttpStatus.NO_CONTENT : HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @PatchMapping("/movies/{id}")
    public ResponseEntity<MovieForm> movieTransaction(@RequestBody Command cmd, @PathVariable int id) {

        Movie m = ms.getMovie(id);

        if(cmd.getCommand().equals("checkout")) {
            m = ms.checkout(m);
        } else if(cmd.getCommand().equals("checkin")) {
            m = ms.checkin(m);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if(m != null) return new ResponseEntity<>(ms.convertToMovieForm(m), HttpStatus.OK);
        else return new ResponseEntity<>(ms.convertToMovieForm(m), HttpStatus.UNPROCESSABLE_ENTITY);
    }

}