package com.ayb.testconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestConfigServerApplication.class, args);
    }

}
