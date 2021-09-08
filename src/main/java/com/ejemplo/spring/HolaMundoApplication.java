package com.ejemplo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ejemplo.spring.service.SaludatorService;

@SpringBootApplication
public class HolaMundoApplication implements CommandLineRunner{

	@Autowired
	SaludatorService saludator;
	
	public static void main(String[] args) {
		SpringApplication.run(HolaMundoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		saludator.saludar("¡Hola Mundo!");
	}

}
