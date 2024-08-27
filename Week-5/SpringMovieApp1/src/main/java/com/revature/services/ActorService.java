package com.revature.services;

import com.revature.models.Actor;
import com.revature.models.ActorForm;

import java.util.List;

public interface ActorService {

    //Trivial Services
    public Actor addActor(Actor a);
    public Actor getActor(int id);
    public List<Actor> getAllActors();
    public Actor updateActor(Actor change);
    public boolean deleteActor(int id);

    //Can be other more interesting services
    public List<Actor> getActor(String name);

    public Actor convertToActor(ActorForm actorForm);
    public ActorForm convertToActorForm(Actor a);

}