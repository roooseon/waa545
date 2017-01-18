package com.waa.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.waa.domain.Product;

@Repository
public class InMemoryProductRepository implements ProductRepository {
	public  List<Product> listOfProduct;
	
	public InMemoryProductRepository() {
		listOfProduct = new ArrayList<>();
		Product pd = new Product();
		
		pd.setProductId("p123");
		pd.setName("Pepsi");
		pd.setUnitPrice(new BigDecimal(1));
		pd.setDescription("Normal Pepsi with fantastic test");
		pd.setManufacturer("Pepsi Incorporate");
		pd.setCategory("Cold Drink");
		pd.setUnitsInStock(100);
		pd.setUnitsInOrder(15);
		pd.setDiscontinued(false);
		pd.setCondition("fresh");
		listOfProduct.add(pd);
		
		Product pd2 =  new Product();
		pd2.setProductId("p1234");
		pd2.setName("Pepsi");
		pd2.setUnitPrice(new BigDecimal(1));
		pd2.setDescription("Normal Pepsi with fantastic test");
		pd2.setManufacturer("Pepsi Incorporate");
		pd2.setCategory("Cold Drink");
		pd2.setUnitsInStock(100);
		pd2.setUnitsInOrder(15);
		pd2.setDiscontinued(false);
		pd2.setCondition("fresh");
		listOfProduct.add(pd2);
	}
	
	@Override
	public List<Product> getAllProducts() {
		
		return listOfProduct;
	}
	
	@Override
	public Product getProductById(String productId) {
		return listOfProduct.stream().filter(x -> productId.equals(x.getProductId())).findFirst().get();
	}
}
