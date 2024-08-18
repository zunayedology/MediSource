package com.springSecured.MedisourceBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionDTO {

    private Long prescriptionId;
    private String prescriptionCode;
    private String prescribedDate;
    private String remarks;
    private Long hospitalId;
    private Long patientId;
    private Long doctorId;
}