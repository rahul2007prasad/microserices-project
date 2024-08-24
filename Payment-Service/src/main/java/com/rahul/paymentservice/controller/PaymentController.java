package com.rahul.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.paymentservice.entity.Payment;
import com.rahul.paymentservice.service.IPaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private IPaymentService paymentService;
	
	@PostMapping("/doPayment")
	public ResponseEntity<Payment> doPayment(@RequestBody Payment payment) {
		Payment savePayment =  paymentService.doPayment(payment);
		return new ResponseEntity<Payment>(savePayment , HttpStatus.CREATED);
	}
	
	
}
