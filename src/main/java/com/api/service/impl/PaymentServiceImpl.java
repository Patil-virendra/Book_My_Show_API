package com.api.service.impl;

import com.api.entitites.Booking;
import com.api.entitites.Movie;
import com.api.entitites.Payment;
import com.api.entitites.User;
import com.api.exceptions.ResourceNotFoundException;
import com.api.payloads.request.PaymentDtoRequest;
import com.api.payloads.response.PaymentDtoResponse;
import com.api.repository.BookingRepository;
import com.api.repository.MovieRepository;
import com.api.repository.PaymentRepository;
import com.api.repository.UserRepository;
import com.api.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private MovieRepository movieRepository;


    @Override
    public PaymentDtoResponse paymentDetails(PaymentDtoRequest paymentRequestDto, String bookingId) {
        return null;
    }

    @Override
    public PaymentDtoResponse updatePayment(PaymentDtoRequest paymentRequestDto, String paymentId) {
        return null;
    }

    @Override
    public void deletePayment(String paymentId) {

    }

    @Override
    public PaymentDtoResponse getPaymentDetailsByPaymentId(String paymentId) {
        return null;
    }

    @Override
    public List<PaymentDtoResponse> getAllPayments() {


    @Override
    public PaymentDtoResponse processPayment(PaymentDtoRequest paymentDtoRequest)
    {
        Booking booking = this.bookingRepository.findById(paymentDtoRequest.getBookingId()).orElseThrow(() -> new ResourceNotFoundException("Booking", "Booking Id", paymentDtoRequest.getBookingId()));


        Payment payment = this.modelMapper.map(paymentDtoRequest, Payment.class);
//        payment.se(booking.getSeats());
         payment.setPaymentTime(LocalDateTime.now());
         payment.setPaymentStatus("Process Payment");

         Payment savedPayment = this.paymentRepository.save(payment);
        return this.modelMapper.map(savedPayment, PaymentDtoResponse.class);
    }

    @Override
    public PaymentDtoRequest refundPayment(PaymentDtoRequest paymentDtoRequest, String paymentId) {
         Payment payment = this.paymentRepository.findById(paymentId).orElseThrow(() -> new ResourceNotFoundException("payment", "paymentId", paymentId));
        payment.setRefundGenerationTime(LocalDateTime.now());
            payment.setPaymentStatus("REFUNDPAYMENT");
         Payment savedRefund = this.paymentRepository.save(payment);
        return this.modelMapper.map(savedRefund, PaymentDtoRequest.class);
    }



