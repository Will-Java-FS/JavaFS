package com.revature.services;

import com.revature.models.Actor;
import com.revature.repositories.ActorRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Objects;
import java.util.Optional;

@SpringBootTest(classes = com.revature.app.SpringMovieAppApplication.class)
public class ActorServiceTests {

    @Autowired
    ActorService as;

    @MockBean
    ActorRepo ar;

    @Test
    void addActor() {
        Actor a = new Actor(0, "Tom Cruise", (short) 55, 600000000);

        //Mock the Actor Repo functionality - save().
        Mockito.when(ar.save(a)).thenReturn(new Actor(1, "Tom Cruise", (short) 55, 600000000));

        //Execute the code which some portion would be Mocked.
        a = as.addActor(a);

        Assertions.assertEquals(1 ,a.getId());
        Assertions.assertEquals("Tom Cruise", a.getName());
    }

    @Test
    void deleteActor() {
        Actor a = new Actor(0, "Tom Cruise", (short) 55, 600000000);

        Mockito.doNothing().when(ar).deleteById(a.getId());

        boolean result = as.deleteActor(a.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void deleteBadActor() {
        Actor a = new Actor(0, "Tom Cruise", (short) 55, 600000000);

        Mockito.doThrow(IllegalArgumentException.class).when(ar).deleteById(a.getId());

        boolean result = as.deleteActor(a.getId());
        Assertions.assertFalse(result);
    }

    @Test
    void getActor() {
        Actor a = new Actor(1, "Tom Cruise", (short) 55, 600000000);
        Optional<Actor> actorOptional = Optional.of(a);

        Mockito.when(ar.findById(a.getId())).thenReturn(actorOptional);

        Actor actual = as.getActor(a.getId());
        Assertions.assertEquals(a.getId(), actual.getId());
        Assertions.assertEquals(a.getName(), actual.getName());

    }

    @Test
    void getNullActor() {

        Mockito.when(ar.findById((1))).thenReturn(Optional.empty());

        Actor actual = as.getActor(1);

        Assertions.assertEquals(actual, new Actor());
    }

}