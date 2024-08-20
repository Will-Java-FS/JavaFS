package com.revature.controllers;

import com.revature.models.Order;
import com.revature.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public void createOrder(@RequestBody Order order){

        //let's print the message to the console for now
        System.out.println(order);
        orderService.sendOrder(order);
    }
}
