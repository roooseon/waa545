package com.consistentcoder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.consistentcoder.model.Authenticate;
import com.consistentcoder.model.User;

@Controller
public class LoginController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model) {
	
		model.addAttribute("message", "Spring 4 MVC Hello World Example Built with Maven");
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginAuthetication(@RequestParam("username") String username, @RequestParam("password") String password, ModelMap model) {
	    
		User user = new User(username, password);
        Authenticate auth = new Authenticate();
        String result = auth.checkAuthenticate(user.getUsername(), user.getPassword());
        
        
        if(result.equalsIgnoreCase("SUCCESS")) {
        	model.addAttribute("username", username);
    		model.addAttribute("password", password);
    		return "welcome";
        
        } else  {
        	model.addAttribute("errorMessage", "username or password is incorrect");
    		return "login";
        }
	}
}