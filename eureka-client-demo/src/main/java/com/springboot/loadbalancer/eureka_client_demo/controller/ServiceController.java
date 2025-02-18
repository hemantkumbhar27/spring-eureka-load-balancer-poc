package com.springboot.loadbalancer.eureka_client_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service Instance 1!";
    }
}
