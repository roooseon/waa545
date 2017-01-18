package com.waa.w1d3lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/", method= RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String processLoginForm() {
		return "welcome";
	}
}
