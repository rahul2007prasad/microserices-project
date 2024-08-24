package com.rahul.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.orderservice.entity.Order;
import com.rahul.orderservice.repo.IOrderRepo;

@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	private IOrderRepo orderRepo;

	@Override
	public Order saveOrder(Order order) {
		return orderRepo.save(order);
	}
}
