package com.waa.exam.repository;

import java.util.List;

import com.waa.exam.domain.User;

public interface UserRepository {
	
	public List<User> getAllUsers();
}
