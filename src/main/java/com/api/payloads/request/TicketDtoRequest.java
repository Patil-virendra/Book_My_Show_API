package com.api.payloads.request;

import com.api.entitites.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TicketDtoRequest {
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
