package com.waa.w1d5lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waa.w1d5lab1.domain.Contact;
import com.waa.w1d5lab1.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired 
	ContactService contactService;
	
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String getAddContactForm(@ModelAttribute("newContact") Contact contact) {
		return "addContact";
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("newContact") Contact contact) {
			contactService.addContact(contact);
			
			return "redirect:/contacts";
	}
	
	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public String showAllContacts(Model model) {
		model.addAttribute("contactList", contactService.getContactList());
		
		return "allContacts";
	}
}
