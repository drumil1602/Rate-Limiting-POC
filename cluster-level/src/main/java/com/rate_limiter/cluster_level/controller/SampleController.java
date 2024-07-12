package com.rate_limiter.cluster_level.controller;

import com.rate_limiter.cluster_level.apiResponse.ApiResponse;
import com.rate_limiter.cluster_level.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    private SampleService service;

    @GetMapping("/first")
    public ResponseEntity<ApiResponse> first(){
        String payload = service.first();
        ApiResponse response = new ApiResponse(payload);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/second")
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
