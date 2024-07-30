package com.revature.app;

import com.revature.controllers.MovieController;
import com.revature.repositories.MovieRepo;
import com.revature.repositories.MovieRepoImpl;
import com.revature.services.MovieService;
import com.revature.services.MovieServiceImpl;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create(JavalinConfig::enableCorsForAllOrigins);

        //Establish our Routes
        establishRoutes(app);

        app.start(8080);
    }
    private static void establishRoutes(Javalin app){
        app.get("/hello",(context)->context.result("Hello World!"));
        app.get("/hello2",new HelloHandler());

        MovieRepo mr = new MovieRepoImpl();
        MovieService ms = new MovieServiceImpl(mr);
        MovieController mc = new MovieController(ms);

        app.get("/movies",mc.getAllMovies);
        app.get("/movies/:id", mc.getMovieByID);

        //app.get("/hello3",)
    }
}
