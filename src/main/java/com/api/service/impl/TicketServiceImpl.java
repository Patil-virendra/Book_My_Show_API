package com.api.service.impl;

import com.api.entitites.*;
import com.api.exceptions.ResourceNotFoundException;
import com.api.payloads.request.TicketDtoRequest;
import com.api.payloads.response.TicketDtoResponse;
import com.api.repository.*;
import com.api.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private CinemaHallRepository cinemaHallRepository;

    @Autowired
    private  PaymentRepository paymentRepository;
    @Override
    public TicketDtoResponse createTicket(TicketDtoRequest ticketRequestdDto, String paymentId, String userId, String movieId, String bookingId) {


        Movie movies = this.movieRepository.findById(movieId)
		.orElseThrow(() -> new ResourceNotFoundException("Movies", "movie Id", movieId));

        Booking booking=this.bookingRepository.findById(bookingId).orElseThrow(() -> new ResourceNotFoundException("Booking", "booking Id", bookingId));

        Payment payment = this.paymentRepository.findById(paymentId)
                .orElseThrow(() -> new ResourceNotFoundException("Payment", "payment Id", paymentId));
        Ticket ticket=this.modelMapper.map(ticketRequestdDto, Ticket.class);

        ticket.setTicketCode(generateTicketCode());


        Ticket ticketGenerated = this.ticketRepository.save(ticket);
        TicketDtoResponse conformTicket = this.modelMapper.map(ticketGenerated, TicketDtoResponse.class);


//        conformTicket.setMovie(payment.getBooking().getMovie().getMovieName());
//        confirmTickit.setMovie(payment.getBooking().getMovies().getMoviePoster());
//        confirmTickit.setLocation(payment.getBooking().getLocation());
//        confirmTickit.setTheater(payment.getBooking().getTheater());
//        confirmTickit.setSeatPrice(payment.getBooking().getSeatPrice());
//        List<String> seats = payment.getBooking().getSeats();
//        confirmTickit.setBookedSeats(seats);
//        LocalTime showTime = payment.getBooking().getShowTime();
//        confirmTickit.setShowTime(showTime);
//        confirmTickit.setFood(payment.getBooking().getFood());
//        confirmTickit.setFoodPrice(payment.getBooking().getFoodPrice());
//        confirmTickit.setTotalPrice(payment.getBooking().getTotalPrice());
//


      //  return confirmTickit;
        return null;
    }

    @Override
    public TicketDtoResponse getTicketById(String ticketId) {
        return null;
    }

    @Override
    public List<TicketDtoResponse> getAllTickets() {
        return null;
    }

//    @Override
//    public TicketDtoResponse generateTicket( String bookingId) {
//
//
//         Booking booking = bookingRepository.findById(bookingId).orElseThrow(() -> new ResourceNotFoundException("booking", "BookingId", bookingId));
//
//         Ticket ticket=new Ticket();
//
//
//        ticket.setBooking(booking);
//        ticket.setUser(booking.getUser());
//        ticket.setMovie(booking.getMovie());
//        ticket.setCinemaHall(booking.getCinemaHall());
//        ticket.setSeatNumbers(booking.getSeats());
//
//        // Save the ticket
//        Ticket savedTicket = this.ticketRepository.save(ticket);
//
//        // Map and return the saved ticket
//        return this.modelMapper.map(savedTicket, TicketDtoResponse.class);
//
//    }
//
//
//
//
//
//
//
//
//
//
//    @Override
//    public List<TicketDtoResponse> getAllTickets() {
//         List<Ticket> allTickets = this.ticketRepository.findAll();
//         List<TicketDtoResponse> collectAllTickets = allTickets.stream().map((ticket) -> modelMapper.map(ticket, TicketDtoResponse.class)).collect(Collectors.toList());
//        return collectAllTickets;
//    }

//    @Override
//    public TicketDto generateTickets(UUID bookingId) {
//
//         Booking booking = bookingRepository.findById(bookingId).orElseThrow(() -> new ResourceNotFoundException("Booking", "BkkingId", bookingId));
//     Ticket ticket=new Ticket();
//     ticket.setBooking(booking);
//     ticket.setUser(booking.getUser());
//     ticket.setMovie(booking.getMovie());
//     ticket.setCinemaHall(booking.getCinemaHall());
//     ticket.setSeatNumber(booking.getSeats());
//         Ticket savedTicket = this.ticketRepository.save(ticket);
//        return this.modelMapper.map(savedTicket,TicketDto.class);


//            }

    private String generateTicketCode() {
        // Logic to generate a unique ticket code using UUID
        return UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase();
    }
}
