package com.lanka.job.repository;

import com.lanka.job.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByDistrict(String district);

    List<Job> findByDistrictAndStatus(String district, String status);

    List<Job> findByCityAndStatus(String city, String status);

    List<Job> findByStatus(String status);

}