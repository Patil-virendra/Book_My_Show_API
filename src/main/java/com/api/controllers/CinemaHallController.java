package com.api.controllers;

import com.api.payloads.request.CinemaHallDtoRequest;
import com.api.payloads.response.CinemaHallDtoResponse;
import com.api.service.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemaHall")
public class CinemaHallController {
    @Autowired
    private CinemaHallService cinemaHallService;
    @PostMapping("/add")
    public ResponseEntity<CinemaHallDtoResponse> addCinemaHall(@RequestBody CinemaHallDtoRequest cinemaHallDtoRequset){
         CinemaHallDtoResponse cinemaHallDtoResponse = this.cinemaHallService.addNewHall(cinemaHallDtoRequset);

        return new ResponseEntity<>(cinemaHallDtoResponse, HttpStatus.CREATED);
    }

    @GetMapping("/details")
    public ResponseEntity<List<CinemaHallDtoResponse>> getCinemaHallDetails(){

         List<CinemaHallDtoResponse> cinemaHallDetails = this.cinemaHallService.getCinemaHallDetails();
         return new ResponseEntity<>(cinemaHallDetails,HttpStatus.OK);
    }
}
