package com.api.payloads.response;

import com.api.entitites.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingDtoResponse {
    private String bookingId;

    private String userId;

    private String username;

    private String movieId;

    private String moviePoster;

    private String movieName;

    //private LocalTime showTime;

    private String location;

    private String theater;

    private List<String> seats;

    private double seatPrice;

    private String food;

    private double foodPrice;

    private double totalPrice;    private ShowTime showTime;
}
