package com.springSecured.MedisourceBackend.repository;

import com.springSecured.MedisourceBackend.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository  extends JpaRepository<Patient,Long> {

}
