package com.example.saludo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoHumano {
	@RequestMapping("/")
	public String saludo(@RequestParam(value="name", required=false) String name, @RequestParam(value="lastname", required=false) String lastname) {
		if(name==null || lastname==null) {
			return "<h1>Welcome Human!</h1>\nWelcome to SpringBoot!";
		}
		return "<h1>Welcome "+name+" "+lastname+"!</h1>\nWelcome to SpringBoot!";
	}
}
