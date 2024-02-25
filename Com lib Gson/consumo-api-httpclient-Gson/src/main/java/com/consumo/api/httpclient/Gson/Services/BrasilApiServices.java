package com.consumo.api.httpclient.Gson.Services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.consumo.api.httpclient.Gson.Entities.BrasilApi;
import com.consumo.api.httpclient.Gson.Repositories.BrasilApiRepository;
import com.google.gson.Gson;

import jakarta.transaction.Transactional;


@Service
public class BrasilApiServices {
	
	@Autowired
	private BrasilApiRepository brasilApiRepository;
	
	
	@Transactional
	public void buscarCep(String url, String cep) {
		
		BrasilApi brasilApi = new BrasilApi();
		Gson gson = new Gson();

		HttpClient httpClient = HttpClient.newHttpClient();

		URI uri;

		try {
			uri = new URI(url + cep);
			HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			
			/*CONVERSÃO DO JSON PARA UMA ENTIDADE ATRAVES DA LIB GSON */
			brasilApi = gson.fromJson(response.body(), BrasilApi.class);
			
					
			int codid = 1;
			String cepDb = brasilApi.getCep();
			String cidadeDb = brasilApi.getCity();
			String bairroDb = brasilApi.getNeighborhood();
			String serviceDb = brasilApi.getService();
			String ufDb = brasilApi.getState();
			String ruaDb = brasilApi.getStreet();
	
			brasilApiRepository.insertDadosCep(codid, cepDb, cidadeDb, bairroDb, serviceDb, ufDb, ruaDb);

			System.out.println("\n[INFO]***************** INICIO DA API **********************");
			System.out.println("Body completo -> " + response.body());
			System.out.println("UF -> " + brasilApi.getState());
			System.out.println("Cidade -> " + brasilApi.getCity());
			System.out.println("Bairro -> " + brasilApi.getNeighborhood());
			System.out.println("[INFO]***************** FIM DA API **********************\n");
			
		} catch (Exception e) {
			System.out.println("Erro ato tentar cria o URI -> " + e.getMessage());
		}
		
		

	}
}
