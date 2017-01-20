package com.waa.w1d5lab1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.waa.w1d5lab1.domain.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	private List<Contact> customerList;
	
	public ContactServiceImpl() {
		customerList = new ArrayList<>();
	}
	
	@Override
	public List<Contact> getContactList() {
		return customerList;
	}

	@Override
	public void addContact(Contact newContact) {
		customerList.add(newContact);
	}

}
