package com.satyendra.ecommerceproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyendra.ecommerceproject.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
	
	Customer findByEmail(String theEmail);
	
}
