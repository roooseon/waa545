package com.waa.w1d5lab1.service;

import java.util.List;

import com.waa.w1d5lab1.domain.Contact;

public interface ContactService {
	public List<Contact> getContactList();
	
	public void addContact(Contact newContact);
}
