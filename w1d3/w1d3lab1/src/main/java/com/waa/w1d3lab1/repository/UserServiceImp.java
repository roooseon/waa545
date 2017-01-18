package com.waa.w1d3lab1.repository;

import org.springframework.stereotype.Repository;

import com.waa.w1d3lab1.domain.User;

@Repository
public class UserServiceImp implements UserService {

	@Override
	public boolean authenticat(User user) {
		
		if ("ramesh".equals(user.getUsername()) && "test123".equals(user.getPassword())) {
			return true;
		
		} else {
			return false;
		}
	}

}
