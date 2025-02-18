package com.springboot.loadbalancer.load_balancing_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class LoadBalancedClientController {


    private final RestTemplate restTemplate;

    public LoadBalancedClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/invoke")
    public String invokeService() {
        String response = restTemplate.getForObject("http://service1/service/hello", String.class);
        return "Response from Service: " + response;
    }
}
