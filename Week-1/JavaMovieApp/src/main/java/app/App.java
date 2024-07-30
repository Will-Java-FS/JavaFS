package app;

import controllers.MovieController;
import io.javalin.Javalin;
import repositories.MovieRepo;
import repositories.MovieRepoImpl;
import services.MovieService;
import services.MovieServiceImpl;

import static io.javalin.apibuilder.ApiBuilder.*;

public class App {

    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins());

        //Establish our Routes
        establishRoutes(app);

        //Javalin does, by default, run on Port 8080
        app.start(8080);

    }

    private static void establishRoutes(Javalin app) {

        MovieRepo mr = new MovieRepoImpl();
        MovieService ms = new MovieServiceImpl(mr);
        MovieController mc = new MovieController(ms);

        app.get("/hello", (context) -> context.result("Hello World!"));
        app.get("/hello2", new HelloHandler());
        app.get("/hello3", mc::anotherHandle);

        app.get("/movies", mc.getAllMovies);
        app.get("/movies/:id", mc.getMovieById);
        app.post("/movies", mc.createMovie);

    }
}