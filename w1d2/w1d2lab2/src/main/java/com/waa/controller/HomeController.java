package com.waa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		return "redirect:/welcome";
	}
	
	 @RequestMapping(value="/welcome", method = RequestMethod.GET) 
	  public String welcome(Model model) {
			model.addAttribute("greeting", "Welcome to our web store");
			model.addAttribute("tagline", "You will get everything you need.");
			
			return "welcome";
		}
	 
}
