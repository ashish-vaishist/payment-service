package com.example.paymentservive.controller;

import com.example.paymentservive.entity.Payment;
import com.example.paymentservive.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {


    @GetMapping("/{message}")
    public String getmessage( @PathVariable String message){

        return "Message: "+message;

    }

    @Autowired
    PaymentService paymentService;

    @PostMapping("/dopayment")
    private Payment doPayment(@RequestBody Payment payment){

        return paymentService.doPayment(payment);
    }
}
