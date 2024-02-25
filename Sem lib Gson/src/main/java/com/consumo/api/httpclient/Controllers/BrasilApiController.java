package com.consumo.api.httpclient.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.consumo.api.httpclient.Services.BrasilApiService;

@RestController
public class BrasilApiController {
	
	@Autowired
	private BrasilApiService brasilApiService;
	
	public void buscarRetornoCep(String url, String cep) {
		brasilApiService.buscarCep(url, cep);
	}

}
