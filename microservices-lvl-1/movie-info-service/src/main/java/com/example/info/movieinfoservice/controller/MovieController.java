package com.example.info.movieinfoservice.controller;

import com.example.info.movieinfoservice.entity.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/movies")
public class MovieController {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable ("movieId") String movieId){
        return new Movie(movieId, "Test name");
    }

}
