package com.example.paymentservive.controller;

import com.example.paymentservive.entity.Payment;
import com.example.paymentservive.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/dopayment")
    private Payment doPayment(@RequestBody Payment payment){

        return paymentService.doPayment(payment);
    }
}
