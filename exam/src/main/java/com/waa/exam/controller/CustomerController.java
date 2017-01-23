package com.waa.exam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waa.exam.domain.Customer;

@Controller
public class CustomerController {
	
	@ModelAttribute("countries")
	public List<String> getListOfCountries() {
		List<String> countries = new ArrayList<>();
		countries.add("NEPAL");
		countries.add("USA");
		countries.add("AUSTRILIA");
		
		return countries;
	}
	
	@ModelAttribute("javaSkills")
	public List<String> getListOfJavaSkills() {
		List<String> javaSkills = new ArrayList<>();
		javaSkills.add("APACHE");
		javaSkills.add("JAVA EE");
		javaSkills.add("SWING");
		javaSkills.add("SPRING");
		
		return javaSkills;
	}
	
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomerForm(@ModelAttribute("newCustomer") Customer customer) {
		return "addCustomer";
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String processCustomerForm(@ModelAttribute("newCustomer") Customer customer) {
		return "showCustomer";
	}
}
