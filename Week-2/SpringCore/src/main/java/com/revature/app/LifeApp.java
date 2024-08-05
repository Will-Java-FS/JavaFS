package com.revature.app;

import com.revature.beans.LifeBean;
import com.revature.config.LifeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LifeConfig.class);

        System.out.println("---------");

        LifeBean lb = ac.getBean(LifeBean.class);

        System.out.println("---------");

        ac.close();


    }

}