package com.doctorsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorsa.dao.AppointmentDao;
import com.doctorsa.entities.Appointment;

@Service
public class AppointmentServiceImp implements AppointmentService {
	
	@Autowired
	private AppointmentDao appointmentDao;
	
	public Appointment addAppointment(Appointment apt){
		Appointment savedAppointment = this.appointmentDao.save(apt);
		return savedAppointment;
	}
	
	public List<Appointment> allAppointments(){
		List<Appointment> appointmentsList = this.appointmentDao.findAll();
		return appointmentsList;
	}

}
