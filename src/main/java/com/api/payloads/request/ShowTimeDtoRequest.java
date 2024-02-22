package com.api.payloads.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ShowTimeDtoRequest {
      private String showTimeId;

        private String movieId;

        private String hallId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Integer availableSeats;
}
