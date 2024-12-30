package com.ayb.testconfigserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class PropertyController {

    @Value("${salutation}")
    private String salutation;

    @Value("${pi}")
    private double pi;

    @Value("${taux}")
    private double taux;

    @GetMapping("/keys")
    public Map<String, Object> getProperties() {
        return Map.of(
                "salutation", salutation,
                "pi", pi,
                "taux", taux
        );
    }
}
