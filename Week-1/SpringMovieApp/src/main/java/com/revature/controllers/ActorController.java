package com.revature.controllers;

import com.revature.models.Actor;
import com.revature.services.ActorService;
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


}
