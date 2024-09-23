package com.example.SWE_B6.services;

import com.example.SWE_B6.entities.Movie;
import com.example.SWE_B6.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements Services{

    @Autowired
    public MovieRepo movieRepo;

    @Override
    public List<Movie> getAll() {
        System.out.println("Running getAll");
        return movieRepo.findAll();
    }

    @Override
    public Movie getMovieByTitle(String name) {
        return movieRepo.getMovieByTitle(name);
    }

    @Override
    public List<Movie> getMoviesByTitle(String name) {

        return movieRepo.getMoviesByTitle(name);
    }

    @Override
    public String addMovie(Movie m) {
        Movie mov = movieRepo.save(m);

        return "Updated! " + mov.toString();
    }

    @Override
    public String deleteMovie(long id) {
        return null;
    }
}
