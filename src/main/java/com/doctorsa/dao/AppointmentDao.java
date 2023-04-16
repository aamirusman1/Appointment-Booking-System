package com.doctorsa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctorsa.entities.Appointment;

@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Integer> {

}
