package com.rate_limiter.cluster_level.service.impl;

import com.rate_limiter.cluster_level.service.SampleService;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {
    @Override
    public String first() {
        return "This is First";
    }

    @Override
    public String second() {
        return "This is Second";
    }

    @Override
    public String third() {
        return "This is Third";
    }

}
