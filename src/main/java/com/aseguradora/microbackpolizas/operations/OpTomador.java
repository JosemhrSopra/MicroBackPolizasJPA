package com.aseguradora.microbackpolizas.operations;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aseguradora.microbackpolizas.entity.Tomador;
import com.aseguradora.microbackpolizas.services.TomadorService;



@Service
public class OpTomador implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired private TomadorService service;
	
	public Tomador getTomadorByPoliza(Integer poliza) {
		return service.getTomadorByPoliza(poliza);
	}
	
	public Tomador updateTomador(Tomador tomador) {
		return service.updateTomador(tomador);
	}
}
