package com.springSecured.MedisourceBackend.controllers;


import com.springSecured.MedisourceBackend.dto.DoctorDTO;
import com.springSecured.MedisourceBackend.dto.PatientDTO;
import com.springSecured.MedisourceBackend.response.RegisterResponse;
import com.springSecured.MedisourceBackend.services.implementations.DoctorService;
import com.springSecured.MedisourceBackend.services.implementations.PatientService;
import jakarta.annotation.security.PermitAll;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/doctor")
@CrossOrigin("*")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;


}
