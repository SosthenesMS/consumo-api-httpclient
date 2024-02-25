package com.consumo.api.httpclient.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.consumo.api.httpclient.Gson.Controllers.BrasilApiController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ConsumoApiHttpclientGsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiHttpclientGsonApplication.class, args);
	}
	
	
	@Autowired
	private BrasilApiController brasilApiController;
	
	@PostConstruct
	public void init() {
		
		final String url = "https://brasilapi.com.br/api/cep/v1/";
		String cep = "54360005";
		
		brasilApiController.BuscarCep(url, cep);
		
	}

}
