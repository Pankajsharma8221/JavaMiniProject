package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	public Customer findByUserName(String userName);
}
