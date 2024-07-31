package com.revature.controllers;

import com.revature.models.Actor;
import com.revature.models.ActorForm;
import com.revature.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ActorController {

    ActorService as;

    @Autowired //Constructor Injection
    public ActorController(ActorService as) {
        this.as = as;
    }

    @GetMapping("/actors")
    public List<ActorForm> getAllActors() {
        System.out.println("Getting All Actors from Database");
        return as.getAllActors().stream()
                .map(a -> as.convertToActorForm(a))
                .collect(Collectors.toList());
    }

    @GetMapping("/actors/{id}")
    public ActorForm getActor(@PathVariable int id) {
        Actor a = as.getActor(id);
        return as.convertToActorForm(a);
    }

    @GetMapping("/actors/search")
    public List<ActorForm> getActorByName(@RequestParam String name) {
        return as.getActor(name).stream()
                .map(a -> as.convertToActorForm(a))
                .collect(Collectors.toList());
    }

    @PostMapping(value = "/actors", consumes = "application/json", produces = "application/json")
    public ActorForm addActor(@RequestBody ActorForm actorForm) {
        Actor a = as.convertToActor(actorForm);
        return as.convertToActorForm(as.addActor(a));
    }

    @PutMapping("/actors/{id}")
    public ActorForm updateActor(@PathVariable int id, @RequestBody ActorForm actorForm) {
        Actor a = as.convertToActor(actorForm);
        //ensure that the Actor object from the Request Body has the correct ID
        a.setId(id);
        return as.convertToActorForm(as.updateActor(a));
    }

    @DeleteMapping("/actors/{id}")
    public ResponseEntity<Boolean> deleteActor(@PathVariable int id) {

        try {
            boolean wasDeleted = as.deleteActor(id);
            return new ResponseEntity<>(wasDeleted, (wasDeleted) ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
        } catch (EmptyResultDataAccessException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }


}