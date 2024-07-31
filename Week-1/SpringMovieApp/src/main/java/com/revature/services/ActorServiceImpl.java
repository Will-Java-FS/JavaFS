package com.revature.services;

import com.revature.models.Actor;
import com.revature.repositories.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    ActorRepo ar;

    @Override
    public Actor getActor(int id) {
        return ar.findById(id).orElseGet(Actor::new);
    }

    @Override
    public List<Actor> getAllActors() {
        return ar.findAll();
    }


}