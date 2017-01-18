package com.waa.w1d3lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.waa.w1d3lab1.domain.User;
import com.waa.w1d3lab1.repository.UserService;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String processLoginForm(User user, Model model) {

		if (userService.authenticat(user)) {
			model.addAttribute("user", user);
			return "redirect:/welcome";

		} else {
			model.addAttribute("errorMessage", "username and/or password is invalid");
			return "login";
		}
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		
		return "login";
	}
}
