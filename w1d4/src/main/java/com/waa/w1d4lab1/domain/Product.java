package com.waa.w1d4lab1.domain;

import java.math.BigDecimal;

public class Product {
	private String productId;
	private String name;
	private BigDecimal unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private int unitsInStock;
	private int unitsInOrder;
	private boolean discontinued;
	private String condition;
	
	public Product() {
		super();
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getUnitsInStock() {
		return unitsInStock;
	}
	
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	public int getUnitsInOrder() {
		return unitsInOrder;
	}
	
	public void setUnitsInOrder(int unitsInOrder) {
		this.unitsInOrder = unitsInOrder;
	}
	
	public boolean isDiscontinued() {
		return discontinued;
	}
	
	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}
	
	public String getCondition() {
		return condition;
	}
	
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
}
