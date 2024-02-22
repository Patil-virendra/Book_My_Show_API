package com.api.service;

import com.api.payloads.request.TicketDtoRequest;
import com.api.payloads.response.TicketDtoResponse;

import java.util.List;

public interface TicketService {
    TicketDtoResponse createTicket(TicketDtoRequest ticketRequestdDto, String paymentId , String userId, String movieId, String bookingId);
    //	TicketResponseDto confirmTicket(TicketRequestdDto ticketRequestdDto, String paymentId);
    TicketDtoResponse getTicketById(String ticketId);
    List<TicketDtoResponse> getAllTickets();
}
