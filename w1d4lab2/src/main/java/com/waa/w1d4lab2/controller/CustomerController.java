package com.waa.w1d4lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waa.w1d4lab2.model.Customer;

@Controller
public class CustomerController {
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomerLogin(@ModelAttribute("newCustomer") Customer newCustomer) {
		return "add-customer";
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String processCustomerLoginForm(@ModelAttribute("newCustomer") Customer newCustomer) {
		return "show-customers";
	}
}
