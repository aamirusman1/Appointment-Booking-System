package com.doctorsa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctorsa.entities.User;


public interface UserDao extends JpaRepository<User,Integer>{

}
