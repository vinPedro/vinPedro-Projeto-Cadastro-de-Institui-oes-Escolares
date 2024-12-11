package com.escola.dao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.escola.model.Escola;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run() {
		return args ->{
			Escola escola = new Escola();
			EscolaDAO escolaDAO = new EscolaDAO();
			
			
		};
	}
}
