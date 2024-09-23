package com.example.SWE_B6.repo;

import com.example.SWE_B6.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository <Movie, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM burrito.movie WHERE title = ?1")
    Movie getMovieByTitle(String title);

    @Query(nativeQuery = true, value = "SELECT * FROM burrito.movie WHERE title LIKE ?1%")
    List<Movie> getMoviesByTitle(String title);
}
