package com.rahul.paymentservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.paymentservice.entity.Payment;
import com.rahul.paymentservice.repo.IPaymentRepo;

@Service
public class PaymentServiceImpl implements IPaymentService{

	@Autowired
	private IPaymentRepo paymentRepo;

	@Override
	public Payment doPayment(Payment payment) {
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepo.save(payment);
	}
	
	
	
}
