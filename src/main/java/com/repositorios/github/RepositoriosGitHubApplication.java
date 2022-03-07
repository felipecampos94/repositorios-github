package com.repositorios.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.repositorios.github.model.Repositorio;

@SpringBootApplication
public class RepositoriosGitHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepositoriosGitHubApplication.class, args);
		
		
		Repositorio repositorio = new Repositorio();
	
	
	}

}
