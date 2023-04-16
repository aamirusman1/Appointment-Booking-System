package com.doctorsa.controller;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doctorsa.entities.Appointment;
import com.doctorsa.entities.Doctor;
import com.doctorsa.entities.User;
import com.doctorsa.service.AppointmentService;
import com.doctorsa.service.DoctorService;
import com.doctorsa.service.UserService;
import com.doctorsa.utility.Utilities;
import com.doctorsa.utility.Utilities.AppointmentTiming;
import com.doctorsa.utility.Utilities.Clinics;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	AppointmentService appointmentService;
	
	//Home Page
	@RequestMapping("/home")
	public String getHome() {
		return "home";
	}
	
	//Patient Registration
	@RequestMapping("/register")
	public String userRegister(Model m) {
		return "userRegister";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User u, Model m) {
		this.userService.saveUser(u);
		m.addAttribute("userSaveMsg", "You are successfully registered with user id: "+u.getUserId());
		return "userRegister";
	}
	
	//Doctor Registration
	@RequestMapping("/doctorregister")
	public String doctorRegister(Model m) {
		List<Doctor> doctorList = this.doctorService.getAllDoctors();
		m.addAttribute("getAllDoctor", doctorList);
		Clinics [] allClinics = Utilities.Clinics.values();
		m.addAttribute("allClinics", allClinics);
		return "doctorRegister";
	}
	@RequestMapping(value="/doctorregister",method=RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("doctor") Doctor d, Model m) {
		this.doctorService.saveDoctor(d);
		m.addAttribute("doctorSaveMsg", "You are successfully registered with user id: "+d.getDoctorId());
		return "doctorRegister";
	}
	
	//Appointment Booking
	@RequestMapping("/appointment")
	public String addAppointment(Model m) {
		List<Doctor> doctorList = this.doctorService.getAllDoctors();
		m.addAttribute("getAllDoctor", doctorList);
		LocalDate today = LocalDate.now(); 
		
		m.addAttribute("todayDate",today);
		AppointmentTiming [] appointmentArray  =  Utilities.AppointmentTiming.values();
		m.addAttribute("allAppointments", appointmentArray);
		Clinics [] allClinics = Utilities.Clinics.values();
		m.addAttribute("allClinics", allClinics);
		return "showAppointment";
	}
	
	@RequestMapping(value="/appointment",method=RequestMethod.POST)
	public String addAppointment(@ModelAttribute("appointment") Appointment apt, Model m) {
		this.appointmentService.addAppointment(apt);
		m.addAttribute("appointmentMsg", "Your appointment booked successfully. Appointment id: "+apt.getAppointmentId()+" || Doctor Name: "+ apt.getDoctorId().getName()+" || Slot Date: "+ apt.getSlotDate()+" || Slot Time: "+apt.getSlotTime());
		return "showAppointment";
	}
	 

}
