package com.aseguradora.microbackpolizas.entity;

public class WSRunExcepcion extends RuntimeException {
	private static final long serialVersionUID = -1679329140523715539L;
	
	private String codError; 
	
	public WSRunExcepcion(String message, Throwable throwable) {
        super(message, throwable);
    }
	
	public WSRunExcepcion(String message) {
        super(message);
    }
	
	public WSRunExcepcion(String codError, String message) {
        super(message);
        this.setCodError(codError);
    }

	public String getCodError() {
		return codError;
	}

	public void setCodError(String codError) {
		this.codError = codError;
	}
}


