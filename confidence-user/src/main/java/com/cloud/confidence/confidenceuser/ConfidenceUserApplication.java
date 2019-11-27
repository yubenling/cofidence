package com.cloud.confidence.confidenceuser;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cloud.confidence.confidenceuser.dao")
public class ConfidenceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfidenceUserApplication.class, args);
    }

}
