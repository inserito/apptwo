package com.ms.apptwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class ApptwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApptwoApplication.class, args);
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAll() {
		return "Hello App Two";
	}
}
