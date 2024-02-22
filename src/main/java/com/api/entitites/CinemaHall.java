package com.api.entitites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CinemaHall {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String hallId;

    private String hallName;

    private String location;

    private Integer seatingCapacity;

    private Integer screens;

    @OneToMany(mappedBy = "cinemaHall",cascade = CascadeType.ALL)
    private List<Booking> bookings= new ArrayList<>();

    @OneToMany(mappedBy = "cinemaHall",cascade = CascadeType.ALL)
    private List<ShowTime> showTime=new ArrayList<>();

    @OneToMany(mappedBy = "cinemaHall",cascade = CascadeType.ALL)
    private List<Ticket> tickets=new ArrayList<>();

}
