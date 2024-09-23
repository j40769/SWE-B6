package com.example.SWE_B6.controller;


import com.example.SWE_B6.entities.Movie;
import com.example.SWE_B6.services.MovieService;
import com.example.SWE_B6.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    @Autowired
    public Services service;

    @GetMapping("/movies")
    public List<Movie> getMovies(){
        return service.getAll();
    }

    //grabs single movie space requires %20 ex.ham ham = ham%20ham
    @GetMapping("/movie/{title}")
    public Movie getMovieByTitle(@PathVariable String title){
        System.out.println(title);
        return service.getMovieByTitle(title);
    }

    //grabs all movies starting with title
    @GetMapping("/movies/{title}")
    public List<Movie> getMoviesByTitle(@PathVariable String title){
        System.out.println(title);
        return service.getMoviesByTitle(title);
    }

    @PostMapping("/movies")
    public String addMovie(@RequestBody Movie movie){

        return service.addMovie(movie);
    }








}
