package com.springSecured.MedisourceBackend.services;

import com.springSecured.MedisourceBackend.dto.PatientDTO;
import com.springSecured.MedisourceBackend.response.RegisterResponse;

public interface PatientServices {
 RegisterResponse registerPatient(PatientDTO body);

}
