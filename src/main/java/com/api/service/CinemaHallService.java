package com.api.service;

import com.api.payloads.request.CinemaHallDtoRequest;
import com.api.payloads.response.CinemaHallDtoResponse;

import java.util.List;

public interface CinemaHallService {
    CinemaHallDtoResponse addNewHall(CinemaHallDtoRequest cinemaHaallDtoRequest);
    List<CinemaHallDtoResponse> getCinemaHallDetails();
}
