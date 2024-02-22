package com.api.service.impl;

import com.api.entitites.CinemaHall;
import com.api.payloads.request.CinemaHallDtoRequest;
import com.api.payloads.response.CinemaHallDtoResponse;
import com.api.repository.CinemaHallRepository;
import com.api.service.CinemaHallService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {
    @Autowired
   private ModelMapper modelMapper;
    @Autowired
    private CinemaHallRepository cinemaHallRepository;
    public CinemaHallDtoResponse addNewHall(CinemaHallDtoRequest cinemaHaallDtoRequest) {
         CinemaHall addedCH = this.modelMapper.map(cinemaHaallDtoRequest, CinemaHall.class);
         CinemaHall saveCH = cinemaHallRepository.save(addedCH);

        return this.modelMapper.map(saveCH, CinemaHallDtoResponse.class);
    }

    @Override
    public List<CinemaHallDtoResponse> getCinemaHallDetails( ) {
        List<CinemaHall> allCH =this. cinemaHallRepository.findAll();
         return  allCH.stream().map((hall) ->modelMapper.map(hall, CinemaHallDtoResponse.class)).collect(Collectors.toList());


    }
}
