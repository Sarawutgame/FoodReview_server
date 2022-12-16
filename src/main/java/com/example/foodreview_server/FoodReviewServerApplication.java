package com.example.foodreview_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FoodReviewServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodReviewServerApplication.class, args);
    }

}
