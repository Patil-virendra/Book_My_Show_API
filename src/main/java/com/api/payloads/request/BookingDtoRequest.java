package com.api.payloads.request;

import com.api.entitites.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookingDtoRequest {


    private String location;//

    private String theater;//

    private List<String> seats;//

    private double seatPrice;

    private String food;

    private double foodPrice;

    private double totalPrice;

    private ShowTime showTime;



}
