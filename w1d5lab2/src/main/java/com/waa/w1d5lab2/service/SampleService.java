package com.waa.w1d5lab2.service;

import com.waa.w1d5lab2.domain.Order;

public interface SampleService {
	
	public String getOrderDescription();
	public String getOrderStringCode();
	public Order getOrder(int id);
	public Order CreateOrder(Order order);
	
}
