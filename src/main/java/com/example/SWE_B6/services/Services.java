package com.example.SWE_B6.services;

import com.example.SWE_B6.entities.Movie;

import java.util.List;

public interface Services {
    List<Movie> getAll();
    String addMovie(Movie m);
    String deleteMovie(long id);

}
