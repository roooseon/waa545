package com.waa.w1d4lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waa.w1d4lab1.domain.Product;
import com.waa.w1d4lab1.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping(value = "/",  method = RequestMethod.GET)
	public String getWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value = "/products/add",  method = RequestMethod.GET)
	public String getAddProductFrom(@ModelAttribute("newProduct") Product newProduct) {
		return "addProduct";
	}
	
	@RequestMapping(value = "/products/add",  method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
		System.out.println(newProduct);
		productRepository.addProduct(newProduct);
		
		return "redirect:/products";
	}
	
	@RequestMapping(value = "/products" , method = RequestMethod.GET)
	public String getAllProducts(Model model) {
		model.addAttribute("products", productRepository.getAllProducts());
		
		
		return "products";
	}
}
