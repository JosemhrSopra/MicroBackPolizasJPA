package com.aseguradora.microbackpolizas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aseguradora.microbackpolizas.entity.RelPolTom;

public interface RelPolTomRepository extends JpaRepository<RelPolTom, Long> {
	
	RelPolTom findById(long id);
	
}