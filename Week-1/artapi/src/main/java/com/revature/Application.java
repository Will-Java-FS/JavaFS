package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Automatically configure & run the Spring ArtApplication Context, start Controllers.
 * You can manually test this API using an API testing tool (thunder client, postman, curl.)
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
