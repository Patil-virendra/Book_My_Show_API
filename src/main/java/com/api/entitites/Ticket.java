package com.api.entitites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String ticketId;

    private List<String> seatNumbers;

    private String conformTicket;
    private String ticketCode;

    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private CinemaHall cinemaHall;

    @OneToOne
    private Booking booking;


    @ManyToOne
    @JoinColumn(name="payment_Id")
    private Payment payment;
}
