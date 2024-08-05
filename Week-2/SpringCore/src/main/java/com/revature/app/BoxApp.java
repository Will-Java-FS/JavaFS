package com.revature.app;

import com.revature.beans.Box;
import com.revature.config.BoxConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoxApp {

    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(BoxConfig.class);

        System.out.println("------------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        Box a = ac.getBean(Box.class);
//        Box b = ac.getBean(Box.class);

        Box a = ac.getBean("getSingleBox", Box.class);
        Box b = ac.getBean("getAnotherBox", Box.class);

        System.out.println(a);
        System.out.println(b);

        a.setVolume(25);

        System.out.println(a);
        System.out.println(b);

        Box c = (Box) ac.getBean("getSingleBox");
        Box d = (Box) ac.getBean("getAnotherBox");

        c.setVolume(30);
        d.setVolume(35);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println(c == d);
        System.out.println(a == c);
        System.out.println(b == d);

    }

}