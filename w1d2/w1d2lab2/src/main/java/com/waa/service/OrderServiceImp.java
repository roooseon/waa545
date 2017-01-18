package com.waa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waa.domain.Product;
import com.waa.repository.ProductRepository;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    ProductRepository productRepository;
	
	@Override
	public void processOrder(String productId, int quantity) {
		Product orderProduct = productRepository.getProductById(productId);
		if (orderProduct != null) {
			
			
			if(quantity < orderProduct.getUnitsInStock()) {
				orderProduct.setUnitsInStock(orderProduct.getUnitsInStock() - quantity);	
			}
			
		} else {
			throw new IllegalArgumentException("The amount of quantity for this product is exceed");
		}
	}

}
