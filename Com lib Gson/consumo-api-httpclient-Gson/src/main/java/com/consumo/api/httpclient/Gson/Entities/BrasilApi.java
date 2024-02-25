package com.consumo.api.httpclient.Gson.Entities;

import com.google.gson.Gson;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "BRASILAPI")
public class BrasilApi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codid;
	private String cep;
	private String state;
	private String city;
	private String neighborhood;
	private String street;
	private String service;
	
	

	public BrasilApi() {
		
	}

	public BrasilApi(String cep, String state, String city, String neighborhood, String street, String service) {
		super();
		this.cep = cep;
		this.state = state;
		this.city = city;
		this.neighborhood = neighborhood;
		this.street = street;
		this.service = service;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

}
