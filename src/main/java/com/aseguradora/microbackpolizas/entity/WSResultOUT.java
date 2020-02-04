package com.aseguradora.microbackpolizas.entity;

import java.io.Serializable;


public class WSResultOUT implements Serializable {

    private final static long serialVersionUID = 1L;
    protected String resultado;
    protected String mensaje;
	protected String cod;
    protected Boolean existeError;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String value) {
        this.resultado = value;
    }

    public Boolean isExisteError() {
        return existeError;
    }

    public void setExisteError(Boolean value) {
        this.existeError = value;
    }
    public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
}