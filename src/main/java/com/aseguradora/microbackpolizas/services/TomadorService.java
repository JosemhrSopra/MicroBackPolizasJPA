package com.aseguradora.microbackpolizas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aseguradora.microbackpolizas.dao.TomadorDAO;
import com.aseguradora.microbackpolizas.entity.Tomador;


@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class TomadorService {
	
	@Autowired private TomadorDAO tomadorDAO;
	
	public Tomador getTomadorByPoliza(Integer poliza){
		return tomadorDAO.getTomadorByPoliza(poliza);
	}

	public Tomador updateTomador(Tomador tomador) {
		return tomadorDAO.updateTomador(tomador);
	}
}
