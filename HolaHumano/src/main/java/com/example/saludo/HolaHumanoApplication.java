package com.example.saludo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HolaHumanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaHumanoApplication.class, args);
	}
}
