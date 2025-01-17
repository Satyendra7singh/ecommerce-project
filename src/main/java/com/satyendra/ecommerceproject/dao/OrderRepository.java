package com.satyendra.ecommerceproject.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.satyendra.ecommerceproject.entity.Order;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order,Long> {
	
	Page<Order> findByCustomerEmailOrderByDateCreatedDesc(@Param("email") String email, Pageable pageable);
	

}
