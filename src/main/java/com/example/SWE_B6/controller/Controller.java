package com.example.SWE_B6.controller;


import com.example.SWE_B6.entities.Movie;
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

    @PostMapping("/movies")
    public String addMovie(@RequestBody Movie movie){

        return service.addMovie(movie);
    }








}
