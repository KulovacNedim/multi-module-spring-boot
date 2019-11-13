package dev.ned.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"dev.ned.persistence"})
@EntityScan(basePackages = {"dev.ned.domain"})
@ComponentScan(basePackages = {"dev.ned.persistence", "dev.ned.web"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
