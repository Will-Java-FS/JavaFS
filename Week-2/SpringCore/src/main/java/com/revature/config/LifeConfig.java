package com.revature.config;

import com.revature.beans.LifeBean;
import org.springframework.context.annotation.Bean;

public class LifeConfig {

    @Bean
    public LifeBean getLifeBean() {
        System.out.println("Making LifeBean");
        return new LifeBean();
    }

}