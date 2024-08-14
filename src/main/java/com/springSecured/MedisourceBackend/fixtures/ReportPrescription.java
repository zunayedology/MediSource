package com.springSecured.MedisourceBackend.fixtures;

import com.springSecured.MedisourceBackend.entities.Prescription;
import com.springSecured.MedisourceBackend.entities.Report;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "report_prescription")
public class ReportPrescription {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String rep_pres_id;

    @ManyToOne
    @JoinColumn(name = "fk_report_id", nullable = false)
    private Report report;

    @ManyToOne
    @JoinColumn(name = "fk_prescription_name", nullable = false)
    private Prescription prescription;
}
