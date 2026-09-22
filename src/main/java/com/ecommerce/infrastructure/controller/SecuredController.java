package com.ecommerce.infrastructure.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secured")
public class SecuredController {

    @GetMapping("/hello")
    @PreAuthorize("hasRole('USER')")
    public String hello() {
        return "Hello, secured world!";
    }
}


src/main/resources/config/application.yml