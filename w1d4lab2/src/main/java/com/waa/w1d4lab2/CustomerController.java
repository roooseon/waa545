package com.waa.w1d4lab2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomerLogin() {
		return "customer";
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String processCustomerLoginForm() {
		return "customers";
	}
}
