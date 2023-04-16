package com.doctorsa.service;

import java.util.List;

import com.doctorsa.entities.User;

public interface UserService {

	User saveUser(User u);
	public List<User> getAllUsers();

}
