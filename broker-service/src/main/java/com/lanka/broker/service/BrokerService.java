package com.lanka.broker.service;

import com.lanka.broker.dto.*;
import com.lanka.broker.model.Broker;
import com.lanka.broker.model.OfflineWorker;
import com.lanka.broker.repository.BrokerRepository;
import com.lanka.broker.repository.OfflineWorkerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class BrokerService {
    private final BrokerRepository brokers;
    private final OfflineWorkerRepository workers;
    private final PasswordEncoder passwordEncoder;

    public BrokerService(BrokerRepository brokers, OfflineWorkerRepository workers, PasswordEncoder passwordEncoder) {
        this.brokers = brokers;
        this.workers = workers;
        this.passwordEncoder = passwordEncoder;
    }
    public BrokerResponse apply(BrokerRequest request) {
        if (request.password() == null || request.password().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Broker password is required");
        }
        Broker broker = new Broker();
        broker.setName(request.name());
        broker.setNic(request.nic());
        broker.setPhone(request.phone());
        broker.setEmail(request.email());
        broker.setPassword(passwordEncoder.encode(request.password()));
        broker.setDistrict(request.district());
        broker.setCity(request.city());
        broker.setYearsExperience(request.yearsExperience());
        broker.setEstimatedWorkers(request.estimatedWorkers());
        broker.setWorkerMethod(request.workerMethod());
        broker.setStatus("PENDING");
        return toResponse(brokers.save(broker));
    }
    }
}