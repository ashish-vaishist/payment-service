package com.example.paymentservive.repository;

import com.example.paymentservive.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Paymentrepo extends JpaRepository<Payment,Long> {


}
