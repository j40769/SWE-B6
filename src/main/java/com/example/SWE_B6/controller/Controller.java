package com.example.SWE_B6.controller;


import com.example.SWE_B6.entities.Movie;
import com.example.SWE_B6.services.MovieServiceInterface;  // Import the correct interface
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*", allowCredentials = "true")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    @Autowired
    public MovieServiceInterface movieService;

    @GetMapping("/movies")
    public List<Movie> getMovies(){

        System.out.println("Get Movie: Controller Enabled");
        return movieService.getAll();
    }

    @PostMapping("/movies")
    public String addMovie(@RequestBody Movie movie){

        return movieService.addMovie(movie);
    }


}
