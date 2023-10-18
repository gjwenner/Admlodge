package com.admlodge.admlodge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdmlodgeApplication {

    //me faltaba este archivo
    @Bean
    public CommandLineRunner initData() {
        return (args) -> {
        };
    }
}