package com.alexspring.alexboot;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlexbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlexbootApplication.class, args);
	}

	

}
