package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
public class HomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping(value = "/characters", method = RequestMethod.GET)
//    @ResponseBody
    public String getCharacters() {
        //simulate retrieving all characters in a DB.
        return "Peach Daisy Yoshi Mario Luigi";
    }

    @GetMapping("/characters/{id}")
    public String getCharacterById(@PathVariable int id) {

        String[] characters = { "Peach", "Daisy", "Yoshi", "Mario", "Luigi"};

        if (id >= 1 && id <= 5) {
            return characters[id - 1];
        } else {
            return "The character you are looking for is in another API.";
        }
    }

}