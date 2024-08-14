package com.springSecured.MedisourceBackend.controllers;


import com.springSecured.MedisourceBackend.dto.PatientDTO;
import com.springSecured.MedisourceBackend.response.RegisterResponse;
import com.springSecured.MedisourceBackend.services.PatientServices;
import com.springSecured.MedisourceBackend.services.implementations.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/patient")
@CrossOrigin("*")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/register-patient")
    @PreAuthorize("hasRole('ADMIN')")
    public RegisterResponse registerPatients(@RequestBody PatientDTO body){
        System.out.println(body.getPatientNationalid());
        return patientService.registerPatient(body);
    }

}
