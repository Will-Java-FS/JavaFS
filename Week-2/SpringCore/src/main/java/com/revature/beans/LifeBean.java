package com.revature.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeBean implements InitializingBean, DisposableBean {


    @PostConstruct
    public void myInit() throws InterruptedException {
        System.out.println("Called my Custom Init Method");
        Thread.sleep(1000);
    }

    @PreDestroy
    public void myTearDown() throws InterruptedException {
        System.out.println("Called my Custom Pre-Destroy method");
        Thread.sleep(1000);
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is bean' destroyed");
        Thread.sleep(1000);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties have been set up");
        Thread.sleep(1000);
    }
}