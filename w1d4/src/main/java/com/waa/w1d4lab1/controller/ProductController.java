package com.waa.w1d4lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@InitBinder
	public void initalizeBinder(WebDataBinder binder) {
		binder.setDisallowedFields("unitsInOrder", "discontinued");
	}
	
	@RequestMapping(value = "/products/add",  method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct, BindingResult result) {
		String[] suppressedFields = result.getSuppressedFields();
		
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields : " + 
								StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		productRepository.addProduct(newProduct);
		
		return "redirect:/products";
	}
	
	@RequestMapping(value = "/products" , method = RequestMethod.GET)
	public String getAllProducts(Model model) {
		model.addAttribute("products", productRepository.getAllProducts());
		
		return "products";
	}
	
	@RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
	public String getProductById(@PathVariable String productId, Model model) {
		model.addAttribute("product", productRepository.getProductById(productId));
		
		return "edit-product";
	}
	
	@RequestMapping(value = "/product/{productId}", method = RequestMethod.POST)
	public String editProduct(@ModelAttribute Product product, @PathVariable("productId") String productId, Model model, 
			BindingResult result){
		
		String[] suppressedFields = result.getSuppressedFields();
		
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields : " + 
								StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		
		boolean checkEdit = productRepository.editProductById(productId, product);
		if (checkEdit) {
			return "redirect:/products";
		
		} else {
			model.addAttribute("product", productRepository.getProductById(productId));
			return "edit-product";
		}
		
	}
	
	@RequestMapping(value = "/product/delete/{productId}",  method = RequestMethod.GET)
	public String deleteProduct(@PathVariable String productId){
		
		boolean deleteStatus  = productRepository.deleteProductById(productId);
		if (deleteStatus) {
			return "redirect:/products";
		
		}
		else {
			return "redirect:/products";
		}
		
	}
}
