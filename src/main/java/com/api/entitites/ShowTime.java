package com.api.entitites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ShowTime {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String showTimeId;

//    @Column(name="MOVIE_ID")
//    private String movieId;
//
//    @Column(name="HALL_ID")
//    private String hallId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Integer availableSeats;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private CinemaHall cinemaHall;

    @OneToOne
    private Booking booking;

}
