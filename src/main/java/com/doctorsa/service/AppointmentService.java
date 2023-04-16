package com.doctorsa.service;

import java.util.List;

import com.doctorsa.entities.Appointment;

public interface AppointmentService {
	Appointment addAppointment(Appointment apt);
	public List<Appointment> allAppointments();

}
