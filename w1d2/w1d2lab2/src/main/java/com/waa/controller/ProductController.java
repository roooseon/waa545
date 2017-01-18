package com.waa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waa.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository inMemoryRepo;
	
	@RequestMapping(value="/products")
	public String getAllProducts(Model model) {
		model.addAttribute("products", inMemoryRepo.getAllProducts());
		
		return "products";
	}
	
	@RequestMapping(value="/product/{productId}", method = RequestMethod.GET) 
	public String getProductdById(@PathVariable String productId, Model model) {
		model.addAttribute("product", inMemoryRepo.getProductById(productId));
		
		return "product";
	}
}
