package com.revature.app;

import com.revature.beans.Donut;
import com.revature.beans.Jelly;
import com.revature.config.BoxConfig;
import com.revature.config.DonutConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DonutApp {

    public static void main(String[] args) {

        //I added BoxConfig here just to show that you can use more
        //than one Config Class. Not actually needed here.
        ApplicationContext ac = new AnnotationConfigApplicationContext(DonutConfig.class, BoxConfig.class);

        System.out.println("-----------");


        Donut rDonut = ac.getBean("getRaspberryDonut", Donut.class);
        Donut lDonut = ac.getBean("getLemonDonut", Donut.class);

        System.out.println(rDonut);
        System.out.println(lDonut);

        Donut rDonut2 = ac.getBean("getRaspberryDonut", Donut.class);
        Donut lDonut2 = ac.getBean("getLemonDonut", Donut.class);

        System.out.println(rDonut2);
        System.out.println(lDonut2);

        System.out.println(rDonut == rDonut2);
        System.out.println(lDonut == lDonut2);

    }

}