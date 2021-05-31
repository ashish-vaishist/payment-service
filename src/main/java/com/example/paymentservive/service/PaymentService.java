package com.example.paymentservive.service;

import com.example.paymentservive.entity.Payment;
import com.example.paymentservive.repository.Paymentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    Paymentrepo paymentrepo;

    public Payment doPayment(Payment payment){
        payment.setTrancid(UUID.randomUUID().toString());
        return  paymentrepo.save(payment);
    }
}
