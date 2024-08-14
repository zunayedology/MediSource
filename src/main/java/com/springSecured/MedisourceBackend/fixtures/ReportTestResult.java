package com.springSecured.MedisourceBackend.fixtures;

import com.springSecured.MedisourceBackend.entities.Report;
import com.springSecured.MedisourceBackend.entities.TestResult;
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
@Table(name = "report_testResult")
public class ReportTestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String rep_res_id;

    @ManyToOne
    @JoinColumn(name = "fk_report_id", nullable = false)
    private Report report;

    @ManyToOne
    @JoinColumn(name = "fk_test_result_name", nullable = false)
    private TestResult testResult;
}
