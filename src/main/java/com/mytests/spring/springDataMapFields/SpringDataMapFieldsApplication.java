package com.mytests.spring.springDataMapFields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataMapFieldsApplication implements CommandLineRunner {

    @Autowired
    private FurnitureService furnitureService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataMapFieldsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        furnitureService.display();
    }
}
