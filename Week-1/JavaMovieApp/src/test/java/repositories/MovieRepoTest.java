package repositories;

import models.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieRepoTest {

    MovieRepo mr = new MovieRepoImpl();

    @Test
    public void getMovie() {

        int id = 1;
        Movie actual = mr.getMovie(id);
        Movie expected = new Movie(1, "The Avengers",1,  7.5, true, 0);

        assertEquals(expected, actual);

    }

}