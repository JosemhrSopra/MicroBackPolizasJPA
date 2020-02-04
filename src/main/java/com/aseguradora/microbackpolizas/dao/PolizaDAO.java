package com.aseguradora.microbackpolizas.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aseguradora.microbackpolizas.entity.Poliza;
import com.aseguradora.microbackpolizas.repository.PolizaRepository;

@Repository
public class PolizaDAO {
		
	private static final String RESULTADO_OK = "OK";
	private static final String RESULTADO_KO = "KO";
	
	@Autowired private PolizaRepository polizaRepository;

	public List<Poliza> getListPolizas() {
		List<Poliza> listPolizas = new ArrayList<>();
		
		try {
			
			listPolizas = polizaRepository.findAll();
			
		} catch (Exception e) {
		}
		
		return listPolizas;
	}

	public Poliza getPolizaById(Integer idPoliza) {
		Poliza poliza = new Poliza();
		
		try {
			poliza = polizaRepository.findPoliza(idPoliza);
			
		} catch (Exception e) {
		}
		
		return poliza;
	}

}
