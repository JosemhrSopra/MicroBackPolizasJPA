package com.aseguradora.microbackpolizas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RelPolTom {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idrelationpolizatomador;

    private Integer idtomador;

    private Integer idpoliza;

    public Integer getIdrelationpolizatomador() {
        return idrelationpolizatomador;
    }

    public void setIdrelationpolizatomador(Integer idrelationpolizatomador) {
        this.idrelationpolizatomador = idrelationpolizatomador;
    }

    public Integer getIdtomador() {
        return idtomador;
    }

    public void setIdtomador(Integer idtomador) {
        this.idtomador = idtomador;
    }

    public Integer getIdpoliza() {
        return idpoliza;
    }

    public void setIdpoliza(Integer idpoliza) {
        this.idpoliza = idpoliza;
    }
}