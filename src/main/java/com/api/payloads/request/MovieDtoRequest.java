package com.api.payloads.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDtoRequest
{
    private String MovieId;

    private String moviePoster;

    private String movieName;

    private LocalDate releaseDate;

    private String category;

    private String genre;

    private Float rating;

    private String country;

}

