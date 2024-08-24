package com.rahul.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.paymentservice.entity.Payment;

public interface IPaymentRepo extends JpaRepository<Payment, Integer>{

}
