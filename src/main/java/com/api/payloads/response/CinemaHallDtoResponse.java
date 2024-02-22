package com.api.payloads.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CinemaHallDtoResponse {
    private String hallId;

    private String hallName;

    private String location;

    private Integer seatingCapacity;

    private Integer screens;


}