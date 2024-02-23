package com.consumo.api.httpclient.Entities;

import java.net.URI;
import java.net.http.HttpClient;
import org.springframework.boot.SpringApplication;
import com.consumo.api.httpclient.ConsumoApiHttpClientApplication;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "BRASILAPI")
public class BrasilApi {
	
	
	public static void main(String[] args) {
		
		String cep = "54360005";
		
		/***PASSO 01: INSTANCIAR UM OBJETO DO TIPO HTTPCLIENT***/
		HttpClient httpClient = HttpClient.newHttpClient();
		
		
		/***PASSO 02: CRIAÇÃO DE UMA URI PARA CONTER O ENDEREÇO DA REQUISIÇÃO QUE SERÁ CHAMADO***/
		URI uri;
		try {
			uri = new URI("https://brasilapi.com.br/api/cep/v1/" + cep);
		} catch (Exception e) {
			System.out.println("Erro encontrado na chamada da API -> " + e.getMessage());
		}
		
		/***PASSO 03: CRIAR UM OBJETO DO TIPO HTTPREQUEST PARA FAZER A REQUISIÇÃO PARA A API***/
		HttpRequest
		
		System.out.println("Finalizado");
		
	}
	

}
