package com.doctorsa.service;

import java.util.List;

import com.doctorsa.entities.Doctor;

public interface DoctorService {

	Doctor saveDoctor(Doctor d);
	public List<Doctor> getAllDoctors();

}
