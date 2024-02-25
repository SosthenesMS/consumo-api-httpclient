package com.consumo.api.httpclient.Services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.springframework.stereotype.Service;

@Service
public class BrasilApiService {
	
	public void buscarCep(String url, String cep) {

		
		/*** PASSO 01: INSTANCIAR UM OBJETO DO TIPO HTTPCLIENT ***/
		HttpClient httpClient = HttpClient.newHttpClient();
		
		
		/*** PASSO 02: CRIAÇÃO DE UMA URI PARA CONTER O ENDEREÇO DA REQUISIÇÃO QUE SERÁ CHAMADO ***/
		URI uri;
		try {
			uri = new URI(url + cep);
			
			/*** PASSO 03: CRIAR UM OBJETO DO TIPO HTTPREQUEST PARA CRIAR A REQUISIÇÃO PARA A API ***/
			HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();
			
			
			/*** PASSO 04: ENVIANDO A REQUISIÇÃO PARA O SERVIDOR E OBTENDO A RESPOSTA ***/
			HttpResponse response;
			response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			int statusCode = response.statusCode();
			
			if (statusCode == 200) {
				System.out.println("Status-Code -> " + statusCode + " OK");
			}
						
			System.out.println("Body -> " + response.body());
			
		} catch (Exception e) {
			System.out.println("Erro encontrado na chamada da API -> " + e.getMessage());
		}
		
		
		
		System.out.println("Finalizado");
		
	}

}
