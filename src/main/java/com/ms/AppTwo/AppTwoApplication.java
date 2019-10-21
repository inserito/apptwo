package com.ms.AppTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class AppTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppTwoApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAll() {
		return "Hello App Two";
	}
}
