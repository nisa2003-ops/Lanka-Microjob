package com.lanka.job.config;

import com.lanka.job.dto.JobRequest;
import com.lanka.job.repository.JobRepository;
import com.lanka.job.service.JobService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class JobSeeder implements CommandLineRunner {
    private final JobRepository jobs;
    private final JobService service;

    public JobSeeder(JobRepository jobs, JobService service) {
        this.jobs = jobs;
        this.service = service;
    }