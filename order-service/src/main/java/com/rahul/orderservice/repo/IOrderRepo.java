package com.rahul.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.orderservice.entity.Order;

public interface IOrderRepo extends JpaRepository<Order, Integer>{

}
