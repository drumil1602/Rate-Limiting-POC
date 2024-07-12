package com.example.demo.controller;

import com.example.demo.apiResponse.ApiResponse;
import com.example.demo.service.SampleService;
import com.example.demo.annotation.WithRateLimitProtection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService service;

    @GetMapping("/first")
    @WithRateLimitProtection
    public ResponseEntity<ApiResponse> first(){
        String payload = service.first();
        ApiResponse response = new ApiResponse(payload);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/second")
    @WithRateLimitProtection
    public ResponseEntity<ApiResponse> second(){
        String payload = service.second();
        ApiResponse response = new ApiResponse(payload);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/third")
    public ResponseEntity<ApiResponse> third(){
        String payload = service.third();
        ApiResponse response = new ApiResponse(payload);
        return ResponseEntity.ok(response);
    }
}
