package com.cloud.confidence.confidenceorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfidenceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfidenceOrderApplication.class, args);
    }

}
