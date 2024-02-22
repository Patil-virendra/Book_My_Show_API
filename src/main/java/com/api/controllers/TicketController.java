package com.api.controllers;

import com.api.payloads.response.TicketDtoResponse;
import com.api.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;
   // @PostMapping("/newticket/{bookingId}")
//    public ResponseEntity<TicketDtoResponse> addNewTicket( @PathVariable String bookingId){
//         TicketDtoResponse ticketDtoResponse = this.ticketService.generateTicket(bookingId);
//        return new ResponseEntity<>(ticketDtoResponse, HttpStatus.CREATED);
  //  }

    @GetMapping("/view")
    public ResponseEntity<List<TicketDtoResponse>> getAllTickets(){
         List<TicketDtoResponse> allTickets = this.ticketService.getAllTickets();
        return new ResponseEntity<>(allTickets,HttpStatus.OK);
    }


}
