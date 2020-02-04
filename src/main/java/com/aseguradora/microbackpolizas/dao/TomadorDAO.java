package com.aseguradora.microbackpolizas.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aseguradora.microbackpolizas.entity.Tomador;
import com.aseguradora.microbackpolizas.repository.TomadorRepository;

@Repository
public class TomadorDAO {
		
	private static final String RESULTADO_OK = "OK";
	private static final String RESULTADO_KO = "KO";
	

	@Autowired private TomadorRepository tomadorRepository;

	public Tomador getTomadorByPoliza(Integer poliza) {
		Tomador tomador = new Tomador();
		
		try {
			tomador = tomadorRepository.findTomadorByPoliza(poliza);

		} catch (Exception e) {
		}
		return 	tomador;
	}

	public Tomador updateTomador(Tomador tomador) {
		try {
			tomador = tomadorRepository.save(tomador);
		} catch (Exception e) {
		}
		return 	tomador;
	}

}
