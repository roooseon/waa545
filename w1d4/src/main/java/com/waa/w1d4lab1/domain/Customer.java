package com.waa.w1d4lab1.domain;


import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


public class Customer {
	
	@NotEmpty(message = "Username must be a string between 6 and 50 characters")
	@Size(min = 6, max = 50)
	@Pattern(regexp = "[a-zA-Z]*")
	public String username;
	
	@NotEmpty(message = "Address may not be empty")
	public String address;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Past(message = "BirthDate must be past date")
	@NotNull(message = "date of birth may not be null")
	public Date birthdate;
	
	@NotEmpty(message = "Password must be a string between 6 and 50 charcters and may not be empty")
	@Size( min = 6, max = 50)
	@Pattern(regexp = "[a-zA-Z]*")
	public String password;
	
	@NotNull(message = "sex may not be null")
	public String sex;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
