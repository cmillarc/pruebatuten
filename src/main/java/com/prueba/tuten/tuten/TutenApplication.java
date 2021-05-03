package com.prueba.tuten.tuten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutenApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TutenApplication.class);
		app.run(args);
	}

}
