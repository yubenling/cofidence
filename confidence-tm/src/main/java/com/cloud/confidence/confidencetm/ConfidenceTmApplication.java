package com.cloud.confidence.confidencetm;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagerServer
public class ConfidenceTmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfidenceTmApplication.class, args);
    }

}
