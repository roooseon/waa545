package com.waa.exam.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.waa.exam.domain.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	private List<User> users;

	public  UserRepositoryImpl() {
		this.users = new ArrayList<>();
	}
	
	@Override
	public List<User> getAllUsers() {
		return this.users;
	}

}
