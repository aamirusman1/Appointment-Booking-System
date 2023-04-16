package com.doctorsa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer doctorId;
	String name;
	String email;
	String specialist;
	String clinic;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(Integer doctorId, String name, String email, String specialist, String clinic) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.email = email;
		this.specialist = specialist;
		this.clinic = clinic;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getClinic() {
		return clinic;
	}
	public void setClinic(String clinic) {
		this.clinic = clinic;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", name=" + name + ", email=" + email + ", specialist=" + specialist
				+ ", clinic=" + clinic + "]";
	}
	
	

}
