package com.revature.controllers;

import com.revature.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    Car c;

    @PutMapping("/car")
    public Car setCarInfo() {
        c.setId(1);
        c.setMake("Ford");
        c.setModel("Focus");
        c.setMileage(0);
        c.setYear(2023);

        return c;
    }

    @GetMapping("/car")
    public Car getCarInfo() {
        System.out.println(c);
        return c;
    }

}