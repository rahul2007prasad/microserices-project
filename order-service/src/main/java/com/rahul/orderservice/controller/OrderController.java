package com.rahul.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.orderservice.entity.Order;
import com.rahul.orderservice.service.IOrderService;

@RestController
@RequestMapping("/")
public class OrderController {

	@Autowired
	private IOrderService orderService;
	
	@PostMapping("/bookOrder")
	public ResponseEntity<Order> bookOrder(@RequestBody Order order) {
		
				Order saveOrder = orderService.saveOrder(order);
				return new ResponseEntity<>(saveOrder,HttpStatus.CREATED);  
	}
	
}
