package com.revature.services;

import com.revature.models.Actor;
import com.revature.models.ActorForm;
import com.revature.models.Movie;
import com.revature.repositories.ActorRepo;
import com.revature.repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    ActorRepo ar; //This is Field Injection

    @Autowired
    MovieRepo mr;

    @Override
    public Actor addActor(Actor a) {
        return ar.save(a);
    }

    @Override
    public Actor getActor(int id) {
//        return ar.findById(id).get();
        Optional<Actor> actorOptional = ar.findById(id);
        return actorOptional.orElseGet(Actor::new);
    }

    @Override
    public List<Actor> getActor(String name) {
        return ar.findByName(name);
    }

    @Override
    public Actor convertToActor(ActorForm actorForm) {

        Actor a = new Actor();

        a.setId(actorForm.getId());
        a.setName(actorForm.getName());
        a.setAge(actorForm.getAge());
        a.setWorth(actorForm.getWorth());

        if(actorForm.getMovies() == null || actorForm.getMovies().size() == 0) {
            a.setMovies(new ArrayList<>());
        } else {
            List<Movie> allMovies = (List<Movie>) mr.findAll();
            a.setMovies(allMovies.stream()
                .filter(x -> actorForm.getMovies().contains((x.getTitle())))
                .collect(Collectors.toList()));
        }

        return a;
    }

    @Override
    public ActorForm convertToActorForm(Actor a) {

        ActorForm actorForm = new ActorForm();

        actorForm.setId(a.getId());
        actorForm.setName(a.getName());
        actorForm.setAge(a.getAge());
        actorForm.setWorth(a.getWorth());

        if(a.getMovies() != null) {
            actorForm.setMovies(a.getMovies().stream()
                    .map(m -> "/movies/" + m.getId())
                    .collect(Collectors.toList()));
        } else {
            actorForm.setMovies(new ArrayList<>());
        }

        return actorForm;
    }

    @Override
    public List<Actor> getAllActors() {
        return (List<Actor>) ar.findAll();
    }

    @Override
    public Actor updateActor(Actor change) {
        return ar.save(change);
    }

    @Override
    public boolean deleteActor(int id) {
        try {
            ar.deleteById(id);
            return true;
        } catch(IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

    }
}