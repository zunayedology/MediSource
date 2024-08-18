package com.springSecured.MedisourceBackend.repository;

import com.springSecured.MedisourceBackend.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
