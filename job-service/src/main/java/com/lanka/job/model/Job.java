package com.lanka.job.model;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    private String employer;
    private String category;
    private String district;
    private String city;
    private Integer workersNeeded;
    private Integer payPerWorker;
    private LocalDate jobDate;
    private String status = "OPEN";
    private Boolean urgent = false;
    private Integer slotsRemaining;
    private String requiredSkills;
    private String additionalNotes;
    private LocalDateTime createdAt;
}
