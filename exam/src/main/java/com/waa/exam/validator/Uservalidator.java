package com.waa.exam.validator;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.waa.exam.domain.User;

@Component
public class Uservalidator implements Validator {

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if(user.getUsername().length() < 6) {
			errors.rejectValue("username", "validator.username.message");
		}	
	}
	
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
