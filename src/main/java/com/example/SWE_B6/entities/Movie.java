package com.example.SWE_B6.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movie_name", nullable = false)
    private String movieName;

    @Column(name = "director_name", nullable = false)
    private String directorName;

    @Column(name = "year_released", nullable = false)
    private int yearReleased;

    @Column(name = "movie_rating")
    private double movieRating;

    @Column(name = "movie_poster")
    private String moviePoster;

    @Column(name = "trailer_url")
    private String trailerUrl;

    @Column(name = "movie_length")
    private int movieLength;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "title")
    private String title; // Added title field

    // Constructor
    public Movie() {}

    public Movie(String title) {
        this.title = title;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
