package com.aseguradora.microbackpolizas.entity;

import java.util.List;


public class WSResultListPolizaOUT extends WSResultOUT {

	private static final long serialVersionUID = 1L;
	
	List<Poliza> listPolizas;

	public List<Poliza> getListPolizas() {
		return listPolizas;
	}

	public void setListPolizas(List<Poliza> listPolizas) {
		this.listPolizas = listPolizas;
	}

}