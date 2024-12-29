package com.satyendra.ecommerceproject.dto;

import java.util.Set;

import com.satyendra.ecommerceproject.entity.Address;
import com.satyendra.ecommerceproject.entity.Customer;
import com.satyendra.ecommerceproject.entity.Order;
import com.satyendra.ecommerceproject.entity.OrderItem;

import lombok.Data;



@Data
public class Purchase {
	
	private Customer customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	
	private Set<OrderItem> orderItems;

}
