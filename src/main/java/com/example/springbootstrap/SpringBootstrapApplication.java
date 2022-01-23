package com.example.springbootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootstrapApplication.class, args);
    }

}
