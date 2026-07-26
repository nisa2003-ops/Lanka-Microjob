package com.lanka.broker.controller;

import com.lanka.broker.dto.*;
import com.lanka.broker.service.BrokerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/brokers")
public class BrokerController {
    private final BrokerService service;

    public BrokerController(BrokerService service) {
        this.service = service;
    }