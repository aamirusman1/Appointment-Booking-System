package com.doctorsa.controller;

import java.io.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doctorsa.dao.AdminDao;
import com.doctorsa.entities.Admin;
import com.doctorsa.entities.Appointment;
import com.doctorsa.entities.Doctor;
import com.doctorsa.entities.User;
import com.doctorsa.service.AppointmentService;
import com.doctorsa.service.DoctorService;
import com.doctorsa.service.UserService;

@Controller
public class LoginDashboardController {
	
	@Autowired
	AdminDao adminDao;
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	AppointmentService appointmentService;
	
	@Autowired
	UserService userService;
	
	//Login Options for Admin, Patient and Doctor
	@RequestMapping("/login")
	public String getLoginPage(){
		return "homeLogin";
	}
	
	//Admin Login
	@RequestMapping("/login/admin")
	public String getAdminLoginPage(Model m){
		
		return "adminLogin";
	}
	@RequestMapping(value="/login/admin",method=RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("adminL") Admin ad, Model m) {
		Admin admin = this.adminDao.validateAdmin(ad.getAdminEmail(), ad.getAdminPassword());
		String adminCheck ="allowed";
		if(admin==null) {
			adminCheck = "Not Allowed";
			//return "wrongCredentials";
		}
		m.addAttribute("adminLoginMsg", adminCheck);
		List<User> patientList = userService.getAllUsers();
		m.addAttribute("allPatients", patientList);
		List<Doctor> doctorsList =  doctorService.getAllDoctors();
		m.addAttribute("doctorsList", doctorsList);
		List<Appointment> appointmentsList = this.appointmentService.allAppointments();
		m.addAttribute("allAppointments", appointmentsList);
		//For categorizing appointments
		 List<Appointment> upcomingAppointments = new ArrayList<>() ;
		 List<Appointment> previousAppointments = new ArrayList<>() ;
		 List<Appointment> todaysAppointments = new ArrayList<>() ;
		 for(Appointment a: appointmentsList) {
			//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd");
			 LocalDate today = LocalDate.now();
		     String slotDate = a.getSlotDate();
		     LocalDate y = LocalDate.parse(slotDate);		 
		     if(today.isBefore(y)) {
		    	 upcomingAppointments.add(a);
		     }else if(y.isBefore(today)) {
		    	 previousAppointments.add(a);
	     }else {
	    	 todaysAppointments.add(a);
	     }
	 }
		 m.addAttribute("nextAppointments", upcomingAppointments);
		 m.addAttribute("pastAppointments", previousAppointments);
		 m.addAttribute("todayAppointments", todaysAppointments);
		return "adminDashboard";
	}
	
	//Patient or User Login
	@RequestMapping("/login/user")
	public String getUserLoginPage(){
		return "userLogin";
	}
	
	//Doctor Login
	@RequestMapping("/login/doctor")
	public String getDoctorLoginPage(){
		return "doctorLogin";
	}

}
