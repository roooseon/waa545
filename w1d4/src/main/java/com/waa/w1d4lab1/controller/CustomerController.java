package com.waa.w1d4lab1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waa.w1d4lab1.domain.Customer;
import com.waa.w1d4lab1.repository.CustomerRepository;

@Controller
public class CustomerController {
	
	@Autowired 
	CustomerRepository customerRepository;
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomerLoginForm(@ModelAttribute("newCustomer") Customer newCustomer) {
		return "customer";
	}
	
	@RequestMapping(value  ="/customer",  method = RequestMethod.POST)
	public String processCustomerLoginForm(@ModelAttribute("newCustomer") @Valid Customer newCustomer, BindingResult result) {
		
		if (result.hasErrors()) {
			return "customer";
		}
		customerRepository.addCustomer(newCustomer);
		return "redirect:/customers";
	}
	
	@RequestMapping(value = "/customers", method  = RequestMethod.GET) 
	public String getAllCustomers(Model model) {
		model.addAttribute("customers", customerRepository.getAllCustomer());
		return "customers";
	}
}
