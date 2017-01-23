package com.waa.w1d5lab2.service;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.waa.w1d5lab2.domain.Order;

@Service
public class SampleServiceImpl implements SampleService {

	@Override
	public String getOrderDescription() {
		Order existingOrder = new Order();
		existingOrder.setDescription("Order for XYZ in units");
		return "Description: " + existingOrder.getDescription();
	}

	@Override
	public String getOrderStringCode() {
		Order existingOrder = new Order();
		existingOrder.setSecurityCode("XYZ");
		return "Account Code: " + existingOrder.getSecurityCode();
	}

	@Override
	public Order getOrder(int id) {
		Order newOrder = new Order();
		newOrder.setOrderId(new Random().nextInt());
		newOrder.setSecurityCode("XYZ");
		newOrder.setOrderStatus("COMPLETED");
		newOrder.setOrderDate(new Date());
		newOrder.setDescription("This is the new XYZ order");
		return newOrder;
	}

	@Override
	public Order CreateOrder(Order order) {
		Order newOrder = new Order();
		newOrder.setOrderId(new Random().nextInt());
		newOrder.setSecurityCode("XYZ");
		newOrder.setOrderStatus("INITIATED");
		newOrder.setOrderDate(new Date());
		return newOrder;
	}

}
