package com.api.controllers;

import com.api.payloads.request.MovieDtoRequest;
import com.api.payloads.response.MovieDtoResponse;
import com.api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

//    @PostMapping("/new")
//    public ResponseEntity<MovieDtoResponse> addMovies(@RequestBody MovieDtoRequest movieDtoRequest){
//         MovieDtoResponse movieDtoResponse = this.movieService.addNewMovie(movieDtoRequest);
//        return new ResponseEntity<>(movieDtoResponse, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/allmovies")
//    public ResponseEntity<List<MovieDtoResponse>> getAllMovieDetails(){
//         List<MovieDtoResponse> allMoviesDelails = this.movieService.getAllMovies();
//         return new ResponseEntity<>(allMoviesDelails,HttpStatus.OK);
//    }
//
//    @GetMapping("/{searchTerm}")
//    public ResponseEntity<List<MovieDtoResponse>> searchMovieByName(@PathVariable String searchTerm){
//         List<MovieDtoResponse> movieDtoResponses = this.movieService.searchMovie(searchTerm);
//        return  new ResponseEntity<>(movieDtoResponses,HttpStatus.OK);
//    }
}
