package com.api.service;

import com.api.payloads.request.PaymentDtoRequest;
import com.api.payloads.response.PaymentDtoResponse;

import java.util.List;

public interface PaymentService {
    PaymentDtoResponse paymentDetails(PaymentDtoRequest paymentRequestDto,String bookingId);
    PaymentDtoResponse updatePayment(PaymentDtoRequest paymentRequestDto, String paymentId);
    void deletePayment(String paymentId);
    PaymentDtoResponse getPaymentDetailsByPaymentId(String paymentId);
    List<PaymentDtoResponse> getAllPayments();
}
