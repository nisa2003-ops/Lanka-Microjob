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