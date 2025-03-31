package com.matacoding.kyungsung01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.matacoding.kyungsung01.Vocabulary")
public class Kyungsung01Application {
    public static void main(String[] args) {
        SpringApplication.run(Kyungsung01Application.class, args);
    }
}
