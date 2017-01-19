package com.waa.w1d4lab1.repository;

import java.util.List;

import com.waa.w1d4lab1.domain.Product;

public interface ProductRepository {
	public List<Product> getAllProducts();
	
	public void addProduct(Product newProduct);
}