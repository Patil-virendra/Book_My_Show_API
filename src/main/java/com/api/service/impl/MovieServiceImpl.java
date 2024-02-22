package com.api.service.impl;

import com.api.entitites.Movie;
import com.api.exceptions.ResourceNotFoundException;
import com.api.payloads.request.MovieDtoRequest;
import com.api.payloads.response.MovieDtoResponse;
import com.api.repository.MovieRepository;
import com.api.service.MovieService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public MovieDtoResponse createMovie(MovieDtoRequest moviesRequestDto) {

        Movie map = this.modelMapper.map(moviesRequestDto, Movie.class);

        //map.setUser(user);
        Movie savedMovies = this.movieRepository.save(map);
        return this.modelMapper.map(savedMovies, MovieDtoResponse.class);    }

    @Override
    public MovieDtoResponse updateMovie(MovieDtoRequest moviesRequestDto, String movieId) {
        Movie movie = this.movieRepository.findById(movieId)
                .orElseThrow(() -> new ResourceNotFoundException("Movies", "movieId", movieId));
        movie.setMovieName(moviesRequestDto.getMovieName());
        movie.setMoviePoster(moviesRequestDto.getMoviePoster());
        movie.setReleaseDate(moviesRequestDto.getReleaseDate());
        movie.setGenre(moviesRequestDto.getGenre());
        movie.setRating(moviesRequestDto.getRating());
        movie.setCountry(moviesRequestDto.getCountry());
        movie.setCategory(moviesRequestDto.getCategory());

        Movie movieUpdate = this.movieRepository.save(movie);
        MovieDtoResponse movieUpdated = this.modelMapper.map(movieUpdate, MovieDtoResponse.class);
        return movieUpdated;    }

    @Override
    public List<MovieDtoResponse> getMovieByName(String movieName) {
        List<Movie> allMovies = this.movieRepository.findAll();
        List<MovieDtoResponse> movies = new ArrayList<>();

        for (Movie movie : allMovies) {

            if (movie.getMovieName().toLowerCase().contains(movieName.toLowerCase())) {
                movies.add(modelMapper.map(movie, MovieDtoResponse.class));
            }
        }

        return movies;
    }

    @Override
    public List<MovieDtoResponse> getAllMovies() {
        List<Movie> movies = this.movieRepository.findAll();
        List<MovieDtoResponse> allMovies = movies.stream().map((movie) -> this.modelMapper.map(movie, MovieDtoResponse.class)).collect(Collectors.toList());
        return allMovies;
    }

    @Override
    public void deleteMovie(String movieId) {
        Movie movie = this.movieRepository.findById(movieId)
                .orElseThrow(() -> new ResourceNotFoundException("MOvies", "movieId", movieId));
        this.movieRepository.delete(movie);
    }
//    @Override
//    public MovieDtoResponse addNewMovie(MovieDtoRequest movieDtoRequest) {
//         Movie newMovie = this.modelMapper.map(movieDtoRequest, Movie.class);
//         Movie savedMovie = this.movieRepository.save(newMovie);
//        return this.modelMapper.map(savedMovie, MovieDtoResponse.class);
//    }
//
//    @Override
//    public List<MovieDtoResponse> getAllMovies() {
//         List<Movie> allMovies = movieRepository.findAll();
//
//         List<MovieDtoResponse> collectMovies = allMovies.stream().map((movie) -> this.modelMapper.map(movie, MovieDtoResponse.class)).collect(Collectors.toList());
//        return collectMovies;
//    }
//
//    @Override
//    public List<MovieDtoResponse> searchMovie(String searchTearm) {
//         List<Movie> allMovies = movieRepository.findAll();
//         List<MovieDtoResponse> resultMovies=new ArrayList<>();
//
//         for (Movie movie:allMovies){
//             if (movie.getMovieTitle().toLowerCase().contains(searchTearm.toLowerCase())){
//                 resultMovies.add(modelMapper.map(movie, MovieDtoResponse.class));
//             }
//         }
//
//        return resultMovies;
//    }
}
