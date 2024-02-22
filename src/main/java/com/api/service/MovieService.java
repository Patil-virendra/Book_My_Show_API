package com.api.service;

import com.api.payloads.request.MovieDtoRequest;
import com.api.payloads.response.MovieDtoResponse;

import java.util.List;

public interface MovieService {
    MovieDtoResponse createMovie(MovieDtoRequest moviesRequestDto);
    MovieDtoResponse updateMovie(MovieDtoRequest moviesRequestDto, String movieId);
    List<MovieDtoResponse> getMovieByName(String movieName);
    List<MovieDtoResponse> getAllMovies();
    void deleteMovie(String movieId);
}
