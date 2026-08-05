package com.lanka.job.controller;
import com.lanka.job.dto.JobRequest;
import com.lanka.job.dto.JobResponse;
import com.lanka.job.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
    private final JobService service;

    public JobController(JobService service) {
        this.service = service;
    }
}