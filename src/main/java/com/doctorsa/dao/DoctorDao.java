package com.doctorsa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctorsa.entities.Doctor;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {

}
