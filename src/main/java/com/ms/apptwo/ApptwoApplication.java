package com.ms.apptwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApptwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApptwoApplication.class, args);
	}
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getAll() {
		return "Hello App Two";
	}
}
