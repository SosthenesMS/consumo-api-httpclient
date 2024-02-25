package com.consumo.api.httpclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.consumo.api.httpclient.Controllers.BrasilApiController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ConsumoApiHttpClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiHttpClientApplication.class, args);
	}
	
	@Autowired
	private BrasilApiController brasilApiController;
	
	@PostConstruct
	public void init() {
		
		final String url = "https://brasilapi.com.br/api/cep/v1/";
		final String cep = "54360005";
		
		brasilApiController.buscarRetornoCep(url, cep);
		
		
	}

}
