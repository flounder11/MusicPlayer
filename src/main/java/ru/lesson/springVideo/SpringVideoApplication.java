package ru.lesson.springVideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @EnableJpaRepositories(basePackages = "com.tacos.taco_cloud.data")
@EntityScan("ru.lesson.springVideo")
public class SpringVideoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringVideoApplication.class, args);
    }
}
