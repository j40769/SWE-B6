package com.example.SWE_B6.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String trailerLink;
    private String picture;
    private String directorName;
    private String yearRelease;
    private String rating;
    private String movieLength;
    private String description;
    private String currentlyPlaying;
    private String upcoming;


    Movie(){

    }
    public Movie(String title){
        this.title = title;
    }

    public Movie(String title, String trailerLink, String picture, String directorName, String yearRelease,
                 String rating, String movieLength, String description, String currentlyPlaying, String upcoming) {
        this.title = title;
        this.trailerLink = trailerLink;
        this.picture = picture;
        this.directorName = directorName;
        this.yearRelease = yearRelease;
        this.rating = rating;
        this.movieLength = movieLength;
        this.description = description;
        this.currentlyPlaying = currentlyPlaying;
        this.upcoming = upcoming;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(String yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(String movieLength) {
        this.movieLength = movieLength;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrentlyPlaying() {
        return currentlyPlaying;
    }

    public void setCurrentlyPlaying(String currentlyPlaying) {
        this.currentlyPlaying = currentlyPlaying;
    }

    public String getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(String upcoming) {
        this.upcoming = upcoming;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", trailerLink='" + trailerLink + '\'' +
                ", picture='" + picture + '\'' +
                ", directorName='" + directorName + '\'' +
                ", yearRelease='" + yearRelease + '\'' +
                ", rating='" + rating + '\'' +
                ", movieLength='" + movieLength + '\'' +
                ", description='" + description + '\'' +
                ", currentlyPlaying='" + currentlyPlaying + '\'' +
                ", upcoming='" + upcoming + '\'' +
                '}';
    }
}
