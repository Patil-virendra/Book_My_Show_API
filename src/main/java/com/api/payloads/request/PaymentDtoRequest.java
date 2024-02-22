package com.api.payloads.request;

import com.api.entitites.Booking;
import com.api.entitites.Ticket;
import com.api.entitites.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PaymentDtoRequest {

    private String paymentId;

    private LocalDateTime paymentTime;

    private String cardType;

    private String cardNumber;

    private String expDate;

    private Integer cvv;

    private double totalPrice;

    private User user;


    private List<Ticket> ticket = new ArrayList<>();


    private Booking booking;
}
