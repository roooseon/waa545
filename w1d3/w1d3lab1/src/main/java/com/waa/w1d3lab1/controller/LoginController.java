package com.waa.w1d3lab1.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	public String getLoginForm(Model model, HttpServletRequest request) {
		String user = checkCookie(request);
		
		if (user != null) {
			model.addAttribute("checked", "checked");
		}
		model.addAttribute("user", user);
		return "login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String processLoginForm(User user, Model model, HttpSession session, HttpServletRequest request, 
			HttpServletResponse response) {
		
		if (userService.authenticat(user)) {
			
			if (request.getParameter("rememberMe") != null) {
				Cookie ckUsername = new Cookie("username", user.getUsername());
				ckUsername.setMaxAge(30 * 24  * 60 * 60);
				response.addCookie(ckUsername);
			
			} else {
				for(Cookie ck: request.getCookies()) {
					if (ck.getName().equalsIgnoreCase("username")) {
						
						ck.setMaxAge(0);
						response.addCookie(ck);
					}					
				}
			}
			
			session.setAttribute("user", user);
			return "redirect:/welcome";

		} else {
			model.addAttribute("errorMessage", "username and/or password is invalid");
			model.addAttribute("user", user.getUsername());
			return "login";
		}
	}
	
	
	@SuppressWarnings("null")
	public String checkCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		
		
		if (cookies == null) {
			return null;
		}
		
		for(Cookie ck: cookies) {
			if (ck.getName().equalsIgnoreCase("username")) {
				return ck.getValue();
			}
		}

		return null;
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		session.invalidate();
		
		return "redirect:/login";
	}
}
