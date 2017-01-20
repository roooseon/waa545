package com.waa.w1d4lab1.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.waa.w1d4lab1.domain.Product;

@Repository
public class ProductRepositoryImp implements ProductRepository { 
	 public List<Product> listOfProducts;
	
	public  ProductRepositoryImp() {
		listOfProducts = new ArrayList<>();
		
		Product pd = new Product();
		
		pd.setProductId("p123");
		pd.setName("Pepsi");
		pd.setUnitPrice(new BigDecimal(1));
		pd.setDescription("Normal Pepsi with fantastic test");
		pd.setManufacturer("Pepsi Incorporate");
		pd.setCategory("Cold Drink");
		pd.setUnitsInOrder(15);
		pd.setCondition("Old");
		listOfProducts.add(pd);
		
		Product pd2 =  new Product();
		pd2.setProductId("p1234");
		pd2.setName("Pepsi");
		pd2.setUnitPrice(new BigDecimal(1));
		pd2.setDescription("Normal Pepsi with fantastic test");
		pd2.setManufacturer("Pepsi Incorporate");
		pd2.setCategory("Cold Drink");
		pd2.setUnitsInOrder(15);
		pd2.setCondition("New");
		listOfProducts.add(pd2);
	}
	
	@Override
	public List<Product> getAllProducts() {
		return listOfProducts;
	}
	
	@Override
	public void addProduct(Product newProduct) {
		listOfProducts.add(newProduct);
	}
	
	@Override
	public Product getProductById(String productId) {
		return listOfProducts.stream().filter(x -> productId.equals(x.getProductId())).findFirst().get();
	}

	@Override
	public boolean editProductById(String productId, Product product) {
		boolean success  = false;
		
		for (int i = 0; i <listOfProducts.size(); i++) {
			
			if (listOfProducts.get(i).getProductId().equals(productId)) {
				
				listOfProducts.get(i).setProductId(product.getProductId());
				listOfProducts.get(i).setName(product.getName());
				listOfProducts.get(i).setUnitPrice(product.getUnitPrice());
				listOfProducts.get(i).setDescription(product.getDescription());
				listOfProducts.get(i).setManufacturer(product.getManufacturer());
				listOfProducts.get(i).setCategory(product.getCategory());
				listOfProducts.get(i).setUnitsInOrder(product.getUnitsInOrder());
				listOfProducts.get(i).setCondition(product.getCondition());
				
				success = true;
			}
			
		}
		return success;
	}

	@Override
	public boolean deleteProductById(String productId) {
		boolean deleteSuccess = false;
		
		for (int i = 0; i < listOfProducts.size(); i++) {
			if (productId.equals(listOfProducts.get(i).getProductId())) {
				listOfProducts.remove(i);
				deleteSuccess = true;
			}
		}
		
		return deleteSuccess;
	}

	
	

}
