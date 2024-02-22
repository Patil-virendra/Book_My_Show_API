package com.api.entitites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String MovieId;
    private String moviePoster;

    private String movieName;

    private LocalDate releaseDate;

    private String category;

    private String genre;

    private Float rating;

    private String country;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<Booking> bookings = new ArrayList<>();


//    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
//    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<Ticket> tickets=new ArrayList<>();

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<ShowTime> showTimes=new ArrayList<>();
//    @ManyToOne
//    private Payment payment;
}
