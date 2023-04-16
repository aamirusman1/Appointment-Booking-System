package com.doctorsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorsa.dao.DoctorDao;
import com.doctorsa.entities.Doctor;

@Service
public class DoctorServiceImp implements DoctorService {

	@Autowired
	private DoctorDao doctorDao;
	
	@Override
	public Doctor saveDoctor(Doctor d) {
		// TODO Auto-generated method stub
		Doctor savedDoctor = this.doctorDao.save(d);
		return savedDoctor;
	}
	
	public List<Doctor> getAllDoctors(){
		List<Doctor> doctorList = this.doctorDao.findAll();
		return doctorList;
	}

}
