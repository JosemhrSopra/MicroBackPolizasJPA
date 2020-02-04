package com.aseguradora.microbackpolizas.entity;

public class WSResultPolizaOUT extends WSResultOUT {

	private static final long serialVersionUID = 1L;
	
	Poliza poliza;

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}


}