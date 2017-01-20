package com.waa.w1d4lab1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.waa.w1d4lab1.domain.Customer;

@Repository
public class CustomerRepositoryImp implements CustomerRepository {
	private List<Customer> customers;
	
	public  CustomerRepositoryImp() {
		customers = new ArrayList<>();
	}
	
	@Override
	public void addCustomer(Customer customer) {
		customers.add(customer);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customers;
	}

}
