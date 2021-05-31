package com.example.paymentservive.entity;


import javax.persistence.*;

@Entity
@Table(name="PAYMENT_TBL")
public class Payment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String paymentstatus;
    private String trancid;
    private Long orderid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrancid() {
        return trancid;
    }

    public void setTrancid(String trancid) {
        this.trancid = trancid;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }
}
