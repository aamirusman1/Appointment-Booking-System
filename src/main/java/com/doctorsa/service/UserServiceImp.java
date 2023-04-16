package com.doctorsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorsa.dao.DoctorDao;
import com.doctorsa.dao.UserDao;
import com.doctorsa.entities.Doctor;
import com.doctorsa.entities.User;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao userDao;
	

	@Override
	public User saveUser(User u) {
		// TODO Auto-generated method stub
		User savedUser = this.userDao.save(u);
		return savedUser;
		
	}
	
	@Override
	public List<User> getAllUsers(){
		List<User> allUsers = this.userDao.findAll();
		return allUsers;
	}

}
