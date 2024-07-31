package com.revature.controllers;

import com.revature.models.Actor;
import com.revature.services.ActorService;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
@CrossOrigin
public class ActorController {

    ActorService as;

    @Autowired //Constructor Injection
    public ActorController(ActorService as) {
        this.as = as;
    }

    @GetMapping
    public List<Actor> getAllActors() {
        return as.getAllActors();
    }

    @GetMapping("/{id}")
    public Actor getActor (@PathVariable int id){
        return as.getActor(id);
    }

    @PostMapping(consumes = "application/json",produces ="application/json")
    public ResponseEntity<Actor> addActor(@RequestBody Actor a){
        a = as.addActor(a);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
}
