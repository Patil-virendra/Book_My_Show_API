package com.api.payloads.response;

import com.api.entitites.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketDtoResponse
{
    private String ticketId;
    private List<String> seatNumbers;
    private User user;
    private Movie movie;
    private CinemaHall cinemaHall;
    private Booking booking;
    private Payment payment;
    private String conformTicket;
    private String ticketCode;

}
