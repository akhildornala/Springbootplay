package com.example.Springbootplay.config;

import com.example.Springbootplay.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean("firstbean")
    public Employee createEmployee1() {
        return new Employee();
    }

    @Bean("secondbean")
    public Employee createEmployee2() {
        return new Employee();
    }
}
