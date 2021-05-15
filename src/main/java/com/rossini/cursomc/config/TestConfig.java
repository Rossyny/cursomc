package com.rossini.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rossini.cursomc.services.DBService;

//Classe que possiu as Configurações específicas do Profiles de teste
@Configuration
@Profile("test")
public class TestConfig {
	
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase () throws ParseException {
		dbService.instantiateTestDatabase();
		
		return true;
	}
	
	

}
