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

    private Long patientId;
    private String patientName;
    private String patientBirthdate;
    private String patientNationalId;
    private String patientAddress;
    private String patientPhone;
    private String patientPassword;
}