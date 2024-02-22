package com.api.controllers;

import com.api.payloads.request.BookingDtoRequest;
import com.api.payloads.request.PaymentDtoRequest;
import com.api.payloads.response.BookingDtoResponse;
import com.api.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookingpage")
public class BookingController {
    @Autowired
    private BookingService bookingService;

//    @PostMapping("/booknow/{userId}/{showTimeId}")
//    public ResponseEntity<BookingDtoResponse> addBooking(@PathVariable String userId, @PathVariable String showTimeId,@RequestBody BookingDtoRequest bookingDtoRequest){
//         BookingDtoResponse booking = this.bookingService.bookSeat(userId, showTimeId, bookingDtoRequest);
//        return new ResponseEntity<>(booking, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/details")
//    public ResponseEntity<List<BookingDtoResponse>> getallBook(){
//         List<BookingDtoResponse> allBookingDetails = this.bookingService.getAllBookingDetails();
//         return new ResponseEntity<>(allBookingDetails,HttpStatus.OK);
//    }
//    @GetMapping("/view-tickets")
//    public ResponseEntity<List<PaymentDtoRequest>> getAllTicket(){
//         List<PaymentDtoRequest> allticket = this.bookingService.getAllticket();
//
//         return new ResponseEntity<>(allticket,HttpStatus.OK);
//
//    }
}
