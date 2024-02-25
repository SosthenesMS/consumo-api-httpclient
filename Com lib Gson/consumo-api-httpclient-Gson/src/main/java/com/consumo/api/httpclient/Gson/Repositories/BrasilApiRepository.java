package com.consumo.api.httpclient.Gson.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.consumo.api.httpclient.Gson.Entities.BrasilApi;


@Repository
public interface BrasilApiRepository extends JpaRepository<BrasilApi, Integer> {

	@Modifying
	@Query(nativeQuery = true, value = "INSERT INTO BRASILAPI (CODID, CEP, CITY, NEIGHBORHOOD, SERVICE, STATE, STREET) VALUES (:codid, :cep, :city, :neighborhood, :service, :state, :street)")
	void insertDadosCep(
			 @Param("codid") int codid
			,@Param("cep") String cep
			,@Param("city") String city
			,@Param("neighborhood") String neighborhood
			,@Param("service") String service
			,@Param("state") String state
			,@Param("street") String street);
	
}