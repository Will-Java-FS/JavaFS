package com.revature.app;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create( config ->config.enableCorsForAllOrigins());

        //Establish our Routes
        establishRoutes(app);

        app.start(8080);
    }
    private static void establishRoutes(Javalin app){
        app.get("/hello",(context)->context.result("Hello World!"));
        app.get("/hello2",new HelloHandler());
        //app.get("/hello3",)
    }
}
