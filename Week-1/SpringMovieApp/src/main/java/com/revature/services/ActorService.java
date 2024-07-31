package com.revature.services;

import com.revature.models.Actor;

import java.util.List;

public interface ActorService {

    //Trivial Services
    public Actor getActor(int id);
    public List<Actor> getAllActors();

}
