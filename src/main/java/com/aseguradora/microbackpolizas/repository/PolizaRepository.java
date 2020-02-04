package com.aseguradora.microbackpolizas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aseguradora.microbackpolizas.entity.Poliza;

public interface PolizaRepository extends JpaRepository<Poliza, Long> {
	
    @Query(value = "select p.idPoliza, p.numPoliza, p.numSup, p.idProducto, p.estado " +
			" from poliza as p " +
		    " where p.idPoliza= :idPoliza" , nativeQuery = true)
    Poliza findPoliza(@Param("idPoliza") Integer idPoliza);
}