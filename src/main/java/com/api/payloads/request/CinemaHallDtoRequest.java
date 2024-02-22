package com.api.payloads.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CinemaHallDtoRequest {
    private String hallName;

    private String location;

    private Integer seatingCapacity;

    private Integer screens;
}
