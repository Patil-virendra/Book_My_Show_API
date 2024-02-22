package com.api.service.impl;

import com.api.entitites.CinemaHall;
import com.api.entitites.Movie;
import com.api.entitites.ShowTime;
import com.api.exceptions.ResourceNotFoundException;
import com.api.payloads.request.ShowTimeDtoRequest;
import com.api.payloads.response.ShowTimeDtoResponse;
import com.api.repository.CinemaHallRepository;
import com.api.repository.MovieRepository;
import com.api.repository.ShowTimeRepository;
import com.api.service.ShowTimeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowTimeServiceImpl implements ShowTimeService {
    @Autowired
   private ShowTimeRepository showTimeRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CinemaHallRepository cinemaHallRepository;
    @Override
    public ShowTimeDtoResponse AddShowTime(ShowTimeDtoRequest showTimeDtoRequest) {
         ShowTime newShowTime = this.modelMapper.map(showTimeDtoRequest, ShowTime.class);
        ShowTime savedShowTime = this.showTimeRepository.save(newShowTime);
        return this.modelMapper.map(savedShowTime, ShowTimeDtoResponse.class);
    }
    //new
    @Override
    public ShowTimeDtoResponse addNewShowTime(ShowTimeDtoRequest showTimeDtoRequest, String movieId, String hallId)
    {
        Movie movie = this.movieRepository.findById(movieId).orElseThrow(() -> new ResourceNotFoundException("Movie", "MovieId", movieId));
        CinemaHall cinemaHall = this.cinemaHallRepository.findById(hallId).orElseThrow(() -> new ResourceNotFoundException("CinemaHall", "HallId", hallId));

        ShowTime show = this.modelMapper.map(showTimeDtoRequest, ShowTime.class);

        show.setMovie(movie);
        show.setCinemaHall(cinemaHall);

        ShowTime savedShow = this.showTimeRepository.save(show);

        return this.modelMapper.map(savedShow, ShowTimeDtoResponse.class);
    }





    @Override
    public List<ShowTimeDtoResponse> GetShowTimeDetails() {
         List<ShowTime> allShowTime = this.showTimeRepository.findAll();
         List<ShowTimeDtoResponse> showTime = allShowTime.stream().map((time) -> modelMapper.map(time, ShowTimeDtoResponse.class)).collect(Collectors.toList());
        return showTime;
    }
}
