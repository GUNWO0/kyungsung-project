package com.matacoding.kyungsung01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})

@EntityScan(basePackages = "com.matacoding.kyungsung01.Vocabulary")
public class Kyungsung01Application {
    public static void main(String[] args) {
        SpringApplication.run(Kyungsung01Application.class, args);
    }
}
