package com.waa.exam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waa.exam.domain.User;
import com.waa.exam.repository.UserRepository;
import com.waa.exam.validator.Uservalidator;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Uservalidator userValidator;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUserLoginPage(@ModelAttribute("newUser") User user) {
		return "userLogin";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String processLoginForm(@ModelAttribute("newUser") @Valid User user, BindingResult result) {
		
		userRepository.getAllUsers();
		
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "userLogin";
		}
		return "showUser";
	}
}
