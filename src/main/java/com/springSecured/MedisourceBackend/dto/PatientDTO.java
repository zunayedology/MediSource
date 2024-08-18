package com.springSecured.MedisourceBackend.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {


    private String patientName;
    private String patientBirthdate;
    private String patientNationalid;
    private String patientAddress;
    private String patientPhone;
    private String patientPassword;
}