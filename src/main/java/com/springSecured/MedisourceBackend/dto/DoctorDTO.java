package com.springSecured.MedisourceBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {

    private String doctorName;
    private String doctorLicense;
    private String doctorSpecialty;
    private String doctorEmail;
    private String doctorPhone;
    private String doctorPassword;

}