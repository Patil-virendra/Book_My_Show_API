package com.api.controllers;

import com.api.payloads.request.PaymentDtoRequest;
import com.api.payloads.response.PaymentDtoResponse;
import com.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
//    @PostMapping("/process")
//    public ResponseEntity<PaymentDtoResponse> paymentProcess(@RequestBody PaymentDtoRequest paymentDtoRequest){
//         PaymentDtoResponse paymentDtoResponse = this.paymentService.processPayment(paymentDtoRequest);
//        return new ResponseEntity<>(paymentDtoResponse, HttpStatus.CREATED);
//    }
//    @GetMapping("/refund/{paymentId}")
//    public ResponseEntity<PaymentDtoRequest> refundpayent(@RequestBody PaymentDtoRequest paymentDtoRequest, @PathVariable String paymentId){
//        final PaymentDtoRequest paymentDtoRequest1 = this.paymentService.refundPayment(paymentDtoRequest, paymentId);
//        return new ResponseEntity<>(paymentDtoRequest1,HttpStatus.OK);
//    }


}
