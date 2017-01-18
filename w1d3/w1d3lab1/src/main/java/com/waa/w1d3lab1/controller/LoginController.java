package com.waa.w1d3lab1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waa.w1d3lab1.domain.User;
import com.waa.w1d3lab1.repository.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String processLoginForm(User user, Model model, HttpSession session) {

		if (userService.authenticat(user)) {
			session.setAttribute("user", user);
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
	public String logout(HttpSession session) {
		session.invalidate();;
		
		return "login";
	}
}
