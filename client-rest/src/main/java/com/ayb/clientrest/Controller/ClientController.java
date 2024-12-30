package com.ayb.clientrest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    private final RestTemplate restTemplate;
    private static final String URL = "http://localhost:8888/one-service/port";

    @Autowired
    public ClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getMeYourPort")
    public String invokeOneService() {
        int port = restTemplate.getForObject(URL, Integer.class);
        return "Response from instance one-service on port: " + port;
    }
}
