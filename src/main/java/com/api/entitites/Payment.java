package com.api.entitites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String paymentId;


    private LocalDateTime paymentTime;

    private String cardType;

    private String cardNumber;

    private String expDate;

    private Integer cvv;

    private double totalPrice;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "payment", cascade = CascadeType.ALL)
    private List<Ticket> ticket = new ArrayList<>();

    @OneToOne
    private Booking booking;

//    @OneToMany(mappedBy = "payment", cascade = CascadeType.ALL)
//    private Movie movie;
}
