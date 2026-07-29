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

    @PostMapping
    BrokerResponse apply(@RequestBody BrokerRequest request) {
        return service.apply(request);
    }

    @PostMapping("/login")
    BrokerLoginResponse login(@RequestBody BrokerLoginRequest request) {
        return service.login(request);
    }
    @GetMapping
    List<BrokerResponse> list() {
        return service.list();
    }

    @GetMapping("/pending")
    List<BrokerResponse> pending() {
        return service.getPending();
    }
}