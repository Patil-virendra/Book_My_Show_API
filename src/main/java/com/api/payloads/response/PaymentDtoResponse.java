package com.api.payloads.response;

import com.api.entitites.Booking;
import com.api.entitites.Ticket;
import com.api.entitites.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PaymentDtoResponse
{
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

