package com.example.Springbootplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.Springbootplay.model", "com.example.Springbootplay.controller"})
public class SpringbootplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootplayApplication.class, args);
		System.out.println("Springbootplay started");
	}

}
