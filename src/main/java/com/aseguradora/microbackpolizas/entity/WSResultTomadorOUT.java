package com.aseguradora.microbackpolizas.entity;

public class WSResultTomadorOUT extends WSResultOUT {

	private static final long serialVersionUID = 1L;
	
	Tomador tomador;

	public Tomador getTomador() {
		return tomador;
	}

	public void setTomador(Tomador tomador) {
		this.tomador = tomador;
	}


}