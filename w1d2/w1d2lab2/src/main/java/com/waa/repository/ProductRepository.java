package com.waa.repository;


import java.util.List;

import com.waa.domain.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	Product getProductById(String productId);
}
