package com.afrodev.apiAvaliacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

//@EntityScan("com.afrodev.apiavaliacao.models")
@SpringBootApplication
public class ApiAvaliacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAvaliacaoApplication.class, args);
	}

}
