package com.revature.repositories;

import com.revature.models.Actor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
Testing the Repository Layer in an application that
uses Spring Data JPa, isn't really worth our time, assuming
we trust the power of Spring Data JPA. But this is for testing demonstrations.
 */
@SpringBootTest(classes = com.revature.app.SpringMovieAppApplication.class)
@Transactional
public class ActorRepoTests {

    @Autowired
    public ActorRepo ar;

    @Test
    void getAllActors() {
        List<Actor> actorList = (List<Actor>) ar.findAll();
        System.out.println(actorList);
        Assertions.assertFalse(actorList.isEmpty());
    }

    @Test
    @Rollback
    void addActor() {
        Actor natalie = new Actor(0, "Natalie Portman", (short) 35,3000000);

        natalie = ar.save(natalie);

        System.out.println(natalie);
        Assertions.assertNotEquals(0, natalie.getId());
    }

}