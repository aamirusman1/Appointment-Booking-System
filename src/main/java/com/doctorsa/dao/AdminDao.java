package com.doctorsa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.doctorsa.entities.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer>{
	
	@Query(value = "select * from admin where admin_email=:e and admin_password=:p", nativeQuery = true)
	Admin validateAdmin(@Param("e") String username, @Param("p") String password);

}
