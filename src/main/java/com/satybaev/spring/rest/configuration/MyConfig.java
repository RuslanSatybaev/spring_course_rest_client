package com.satybaev.spring.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.satybaev.spring.rest")
public class MyConfig {

    @Bean
    public RestTemplate restTempliate(){
        return new RestTemplate();
    }
}
