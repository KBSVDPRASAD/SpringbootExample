package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

    @GetMapping("/call-other-api")
    public String callOtherApi() {

        RestTemplate restTemplate = new RestTemplate();

        String otherApiUrl = "http://localhost:8082/api/external";

        String response = restTemplate.getForObject(otherApiUrl, String.class);

        return "Response from other API: " + response;
    }

    @GetMapping("/call-another-api")
    public String callanotherApi() {

//        RestTemplate restTemplate = new RestTemplate();

//        String otherApiUrl = "http://localhost:8081/api/external";

//        String response = restTemplate.getForObject(otherApiUrl, String.class);

        return "Hello Team";
    }
}

