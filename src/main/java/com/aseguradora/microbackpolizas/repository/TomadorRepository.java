package com.aseguradora.microbackpolizas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aseguradora.microbackpolizas.entity.Tomador;

public interface TomadorRepository extends JpaRepository<Tomador, Long> {
	
    @Query(value = "select t.idTomador, t.nombre, t.apellidos, t.dni " +
			" from relationpolizatomador as r " +
			"	 inner join tomador as t on r.idTomador = t.idTomador "+
		    " where r.idPoliza= :idPoliza" , nativeQuery = true)
    Tomador findTomadorByPoliza(@Param("idPoliza") Integer idPoliza);

}