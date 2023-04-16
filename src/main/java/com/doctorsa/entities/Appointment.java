package com.doctorsa.entities;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	private String dateCreated;
	private String slotDate;
	private String slotTime;
	@ManyToOne
	@JoinColumn(name="userId")
	private User userId;
	@ManyToOne
	@JoinColumn(name="doctorId")
	private Doctor doctorId;
	private String clinic;
	private String feedback;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(int appointmentId, String dateCreated, String slotDate, String slotTime, User userId,
			Doctor doctorId, String clinic, String feedback) {
		super();
		this.appointmentId = appointmentId;
		this.dateCreated = dateCreated;
		this.slotDate = slotDate;
		this.slotTime = slotTime;
		this.userId = userId;
		this.doctorId = doctorId;
		this.clinic = clinic;
		this.feedback = feedback;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getSlotDate() {
		return slotDate;
	}
	public void setSlotDate(String slotDate) {
		this.slotDate = slotDate;
	}
	public String getSlotTime() {
		return slotTime;
	}
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public Doctor getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}
	public String getClinic() {
		return clinic;
	}
	public void setClinic(String clinic) {
		this.clinic = clinic;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", dateCreated=" + dateCreated + ", slotDate=" + slotDate
				+ ", slotTime=" + slotTime + ", userId=" + userId + ", doctorId=" + doctorId + ", clinic=" + clinic
				+ ", feedback=" + feedback + "]";
	}
	
	

}
