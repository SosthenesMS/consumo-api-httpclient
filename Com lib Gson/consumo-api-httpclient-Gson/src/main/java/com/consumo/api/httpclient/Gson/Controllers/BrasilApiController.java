package com.consumo.api.httpclient.Gson.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.consumo.api.httpclient.Gson.Services.BrasilApiServices;


@RestController
public class BrasilApiController {
	
	@Autowired
	private BrasilApiServices brasilApiServices;
	
	public void BuscarCep(String url, String cep) {
		
		brasilApiServices.buscarCep(url, cep);
	}
}
