package com.revature.config;

import com.revature.beans.Box;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BoxConfig {

    @Bean
    public Box getSingleBox() {
        System.out.println("Getting you a box");
        return new Box(15);
    }

    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Scope("prototype")
    public Box getAnotherBox() {
        System.out.println("Getting you another box");
        return new Box(20);
    }

}