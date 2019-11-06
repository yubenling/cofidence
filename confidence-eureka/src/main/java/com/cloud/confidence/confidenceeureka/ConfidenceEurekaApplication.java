package com.cloud.confidence.confidenceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfidenceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfidenceEurekaApplication.class, args);
    }

}
