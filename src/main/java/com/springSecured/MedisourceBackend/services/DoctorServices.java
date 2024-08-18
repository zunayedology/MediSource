package com.springSecured.MedisourceBackend.services;

import com.springSecured.MedisourceBackend.dto.DoctorDTO;
import com.springSecured.MedisourceBackend.dto.PatientDTO;
import com.springSecured.MedisourceBackend.response.RegisterResponse;

public interface DoctorServices {
    RegisterResponse registerDoctor(DoctorDTO body);

}
