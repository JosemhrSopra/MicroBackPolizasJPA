package com.aseguradora.microbackpolizas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aseguradora.microbackpolizas.dao.PolizaDAO;
import com.aseguradora.microbackpolizas.entity.Poliza;


@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class PolizaService {
	
	@Autowired private PolizaDAO polizaDAO;
	
	public List<Poliza> getListPolizas() {
		return polizaDAO.getListPolizas();
	}

	public Poliza getPoliza(Integer idpoliza) {
		return polizaDAO.getPolizaById(idpoliza);
	}
}
