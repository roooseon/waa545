package com.waa.w1d4lab1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.waa.w1d4lab1.domain.Product;

@Repository
public class ProductRepositoryImp implements ProductRepository { 
	 public List<Product> listOfProducts;
	
	public  ProductRepositoryImp() {
		listOfProducts = new ArrayList<>();
	}
	
	@Override
	public List<Product> getAllProducts() {
		return listOfProducts;
	}
	
	@Override
	public void addProduct(Product newProduct) {
		listOfProducts.add(newProduct);
	}

}
