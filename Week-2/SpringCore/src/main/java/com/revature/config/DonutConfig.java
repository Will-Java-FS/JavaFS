package com.revature.config;

import com.revature.beans.Donut;
import com.revature.beans.Jelly;
import com.revature.beans.LemonJelly;
import com.revature.beans.RaspberryJelly;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class DonutConfig {

    @Bean
    public Jelly getLemonJelly() {
        Jelly lemon = new LemonJelly();

        lemon.setFlavor("Lemon Curd");
        System.out.println("Making Lemon Jelly");

        return lemon;
    }

    @Bean
    public Jelly getRaspberryJelly() {
        Jelly raspberry = new RaspberryJelly();

        raspberry.setFlavor("Raspberry Surprise!");
        System.out.println("Making Raspberry Jelly");

        return raspberry;
    }

    @Bean
    @Scope("prototype")
    public Donut getRaspberryDonut(RaspberryJelly rJelly) {
        System.out.println("Making a Raspberry Donut");

        //Constructor Injection
        Donut rDonut = new Donut("Raspberry Filled", 3.25, rJelly);
        return rDonut;
    }

    @Bean
    @Scope("prototype")
    public Donut getLemonDonut(LemonJelly lJelly) {
        System.out.println("Making a Lemon Donut");

        Donut lDonut = new Donut();
        lDonut.setName("Lemon Filled");
        lDonut.setCost(2.75);
        //Setter Injection
        lDonut.setJelly(lJelly);

        return lDonut;
    }


}