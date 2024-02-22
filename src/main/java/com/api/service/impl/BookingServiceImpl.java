package com.api.service.impl;

import com.api.entitites.*;
import com.api.exceptions.ResourceNotFoundException;
import com.api.payloads.request.BookingDtoRequest;
import com.api.payloads.request.PaymentDtoRequest;
import com.api.payloads.response.BookingDtoResponse;
import com.api.repository.*;
import com.api.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class BookingServiceImpl implements BookingService {
   @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CinemaHallRepository cinemaHallRepository;
    @Autowired
    private ShowTimeRepository showTimeRepository;

    @Override
    public BookingDtoResponse bookSeat(BookingDtoRequest bookingRequestDto, String userId, String movieId) {
        return null;
    }

    @Override
    public BookingDtoResponse updateBooking(BookingDtoRequest bookingDto, String bookingId, String userId) {
        return null;
    }

    @Override
    public void deleteBooking(String bookingId) {

    }

    @Override
    public BookingDtoResponse getBookingBYBookingId(String bookingId) {
        return null;
    }

    @Override
    public List<BookingDtoResponse> getAllBookings() {
        return null;
    }

    @Override
    public List<BookingDtoResponse> getBookingByUserId(String userId) {
        return null;
    }

    @Override
    public List<BookingDtoResponse> getBookingByUsername(String username) {
        return null;
    }


//    @Override
//    public BookingDtoResponse bookSeat(String userId, String showTimeId, BookingDtoRequest bookingDtoRequest)
//    {
//
//         User user = this.userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "UserID", userId));
//
//         ShowTime showTime = this.showTimeRepository.findById(showTimeId).orElseThrow(() -> new ResourceNotFoundException("ShowTime", "ShowTimeID", showTimeId));
//
//         Movie movie = this.movieRepository.findById(showTime.getMovie().getMovieId()).orElseThrow(() -> new ResourceNotFoundException("Movie", "MovieId", showTime.getMovie().getMovieId()));
//
//         CinemaHall cinemaHall = this.cinemaHallRepository.findById(showTime.getCinemaHall().getHallId()).orElseThrow(() -> new ResourceNotFoundException("hall", "hallId", showTime.getCinemaHall().getHallId()));
//
//         Booking map = this.modelMapper.map(bookingDtoRequest, Booking.class);
//         Booking book=new Booking();
//         book.setUser(user);
//         book.setShowTime(showTime);
//         book.setMovie(movie);
//         book.setCinemaHall(cinemaHall);
//        book.setTotalAmount(map.getTotalAmount());
//        book.setSeats(map.getSeats());
//        book.setStatus("CONFIRMED");
//
//      book.setFoodName(map.getFoodName());
//      book.setFoodPrice(map.getFoodPrice());
//       book.getFoodPrice();
//         Booking saved = this.bookingRepository.save(book);
//
//         return this.modelMapper.map(saved, BookingDtoResponse.class);
//
////     movieRepository.findById(bookingDtoRequest.getMovieId()).orElseThrow(() -> new ResourceNotFoundException("Movie", "Movie Id", bookingDtoRequest.getMovieId()));
////        CinemaHall cinemaHall = this.cinemaHallRepository.findById(bookingDtoRequest.getHallId()).orElseThrow(() -> new ResourceNotFoundException("Hall", "HallId", bookingDtoRequest.getHallId()));
////        Booking addbooking = this.modelMapper.map(bookingDtoRequest, Booking.class);
////        addbooking.setMovie(movie);
////        addbooking.setCinemaHall(cinemaHall);
////         Booking savedBooking = this.bookingRepository.save(addbooking);
////        return this.modelMapper.map(savedBooking,BookingDtoResponse.class);
//    }
//
//    @Override
//    public List<BookingDtoResponse> getAllBookingDetails() {
//         List<Booking> allBooking = this.bookingRepository.findAll();
//        return allBooking.stream().map((book)->modelMapper.map(book,BookingDtoResponse.class)).collect(Collectors.toList());
//    }
//
//    @Override
//    public List<PaymentDtoRequest> getAllticket() {
//
//        List<PaymentDtoRequest> getAll=new ArrayList<>();
//        List<Booking>  getBooking=bookingRepository.findAll();
//
//        for(Booking book:getBooking) {
//
//            PaymentDtoRequest cp=new PaymentDtoRequest();
//            cp.setUserId(book.getUser().getUserId());
//            cp.setUserId(book.getUser().getUserId());
//            cp.setAmount(book.getTotalAmount());
//            cp.setPaymentId(book.getPayment().getPaymentId());
//
//            getAll.add(cp);
//
//        }
//
//
//        return getAll;
//    }

}
