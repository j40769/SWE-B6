package com.example.SWE_B6.repo;

import com.example.SWE_B6.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepo extends JpaRepository <Movie, Long> {
}
