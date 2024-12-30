package com.ayb.oneservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String getPort() {
        return port;
    }
}
