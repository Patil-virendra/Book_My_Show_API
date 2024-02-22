package com.api.repository;

import com.api.entitites.Booking;
import com.api.entitites.User;
import com.api.payloads.request.BookingDtoRequest;
import com.api.payloads.response.BookingDtoResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, String> {
//    public List<Booking> findByUserUserId(String userId);
//
//    public List<Booking> findByMovieMovieId(String movieId);
//
//    public List<Booking> findByCinemaHallHallId(String cinemaHallId);

//    BookingDtoResponse bookSeat(BookingDtoRequest bookingRequestDto, String userId, String movieId);
//    BookingDtoResponse updateBooking(BookingDtoRequest bookingDto, String bookingId, String userId);
//    void deleteBooking(String bookingId);
//    BookingDtoResponse getBookingBYBookingId(String bookingId);
//    List<BookingDtoResponse> getAllBookings();
//    List<BookingDtoResponse> getBookingByUserId(String userId);
//    List<BookingDtoResponse> getBookingByUsername(String username);
//}
List<Booking> findByUser(User user);

}