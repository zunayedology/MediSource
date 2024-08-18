package com.springSecured.MedisourceBackend.controllers;

import com.springSecured.MedisourceBackend.dto.DoctorDTO;

import com.springSecured.MedisourceBackend.dto.LoginResponseDTO;
import com.springSecured.MedisourceBackend.dto.PatientDTO;
import com.springSecured.MedisourceBackend.dto.RegistrationDTO;
import com.springSecured.MedisourceBackend.response.RegisterResponse;
import com.springSecured.MedisourceBackend.services.AuthenticationService;

import com.springSecured.MedisourceBackend.services.implementations.DoctorService;
import com.springSecured.MedisourceBackend.services.implementations.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    @PostMapping("/register")
    public RegisterResponse registerUser(@RequestBody RegistrationDTO body){
        return authenticationService.registerUser(body);
    }
    
    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
        return authenticationService.loginUser(body);
    }

    @PostMapping("/register-doctor")
    public RegisterResponse registerDoctors(@RequestBody DoctorDTO body){
        System.out.println(body.getDoctorEmail());
        return doctorService.registerDoctor(body);
    }

    @PostMapping("/register-patient")
    public RegisterResponse registerPatients(@RequestBody PatientDTO body){
        System.out.println(body.getPatientNationalid());
        return patientService.registerPatient(body);
    }
}   
