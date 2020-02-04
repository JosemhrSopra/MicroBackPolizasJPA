package com.aseguradora.microbackpolizas.operations;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aseguradora.microbackpolizas.entity.Poliza;
import com.aseguradora.microbackpolizas.services.PolizaService;



@Service
public class OpPoliza implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired private PolizaService service;
	
	public List<Poliza> getListPolizas () {
		return service.getListPolizas();
	}

	public Poliza getPoliza(Integer idpoliza) {
		return service.getPoliza(idpoliza);
	}
}
