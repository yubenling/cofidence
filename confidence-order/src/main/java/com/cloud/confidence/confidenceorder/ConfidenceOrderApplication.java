package com.cloud.confidence.confidenceorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cloud.confidence.confidenceorder.dao")
public class ConfidenceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfidenceOrderApplication.class, args);
    }

}
