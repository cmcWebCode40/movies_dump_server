package com.movies_api.movies_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}
	public boolean appStatus (boolean status) {
		return  status;
	}
}
