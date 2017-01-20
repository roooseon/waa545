package com.waa.w1d4lab1.repository;

import java.util.List;

import com.waa.w1d4lab1.domain.Customer;

public interface CustomerRepository {
	
	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}
