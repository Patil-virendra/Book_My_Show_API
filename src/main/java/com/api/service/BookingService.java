package com.api.service;

import com.api.payloads.request.BookingDtoRequest;
import com.api.payloads.request.PaymentDtoRequest;
import com.api.payloads.response.BookingDtoResponse;

import java.util.List;


public interface BookingService {
    BookingDtoResponse bookSeat(BookingDtoRequest bookingRequestDto, String userId, String movieId);
    BookingDtoResponse updateBooking(BookingDtoRequest bookingDto, String bookingId, String userId);
    void deleteBooking(String bookingId);
    BookingDtoResponse getBookingBYBookingId(String bookingId);
    List<BookingDtoResponse> getAllBookings();
    List<BookingDtoResponse> getBookingByUserId(String userId);
    List<BookingDtoResponse> getBookingByUsername(String username);
}
