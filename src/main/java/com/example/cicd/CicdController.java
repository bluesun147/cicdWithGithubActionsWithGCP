package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {
    @GetMapping("/cicd")
    public String test() {
        return "cicd With Github Actions With GCP\n!";
    }
}