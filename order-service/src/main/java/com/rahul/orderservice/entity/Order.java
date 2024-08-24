package com.rahul.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ORDER")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter

public class Order {
	
	private Integer id;
	private String name;
	private int qty;
	private double price;
	
	
}
