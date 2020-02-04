package com.aseguradora.microbackpolizas.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aseguradora.microbackpolizas.entity.Poliza;
import com.aseguradora.microbackpolizas.entity.Tomador;
import com.aseguradora.microbackpolizas.entity.WSResultListPolizaOUT;
import com.aseguradora.microbackpolizas.entity.WSResultPolizaOUT;
import com.aseguradora.microbackpolizas.entity.WSResultTomadorOUT;
import com.aseguradora.microbackpolizas.entity.WSRunExcepcion;
import com.aseguradora.microbackpolizas.operations.OpPoliza;
import com.aseguradora.microbackpolizas.operations.OpTomador;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping("/poliza")
public class PolizasBackController {

	private static final String GET_POLIZAS = "/getPolizas";
	private static final String GET_POLIZA = "/getPoliza/{idpoliza}";
	private static final String GET_TOMADOR = "/getTomadorByIdPoliza/{idpoliza}";
	private static final String POST_TOMADOR = "/updateTomador";
	
	private static final String RESULTADO_OK = "OK";
	private static final String MSG_OK = "Todo ha ido genial en JPA";
	private static final String RESULTADO_KO = "KO";
	
	@Autowired private OpPoliza opPoliza;
	@Autowired private OpTomador opTomador;
	
	@ApiOperation(value = "SaludoTest", code = 200, notes = "Get all polizas", produces = "application/json")
	@GetMapping
	public String test() {
		List<Integer> lista = Arrays.asList(1,2,3,4);
		List<Integer> subLista = lista.stream().filter(p -> (p%2==0)).collect(Collectors.toList());
		return subLista.toString();
	}
	
	@ApiOperation(value = GET_POLIZAS, code = 200, notes = "Get all polizas", produces = "application/json")
	@GetMapping(GET_POLIZAS)
	public @ResponseBody WSResultListPolizaOUT getListPolizas() throws Exception {
	
		WSResultListPolizaOUT out = new  WSResultListPolizaOUT();
		
		try {
			List<Poliza> resul = opPoliza.getListPolizas();
			
			out.setListPolizas(resul);
			out.setResultado(RESULTADO_OK);
			out.setExisteError(Boolean.FALSE);
			out.setMensaje(MSG_OK);
	
		} catch(WSRunExcepcion e) {
			out.setResultado(RESULTADO_KO);
			out.setExisteError(Boolean.TRUE);
			out.setMensaje(e.getMessage());
			out.setCod(e.getCodError());
			
		}
		return out;
	}
	
	@ApiOperation(value = GET_POLIZA, code = 200, notes = "Get Poliza by ID Poliza", produces = "application/json")
	@GetMapping(GET_POLIZA)
	public @ResponseBody WSResultPolizaOUT getPoliza(
			@PathVariable("idpoliza") Integer idpoliza
			) throws Exception {
	
		WSResultPolizaOUT out = new  WSResultPolizaOUT();
		
		try {
			Poliza resul = opPoliza.getPoliza(idpoliza);
			
			out.setPoliza(resul);
			out.setResultado(RESULTADO_OK);
			out.setExisteError(Boolean.FALSE);
			out.setMensaje(MSG_OK);
	
		} catch(WSRunExcepcion e) {
			out.setResultado(RESULTADO_KO);
			out.setExisteError(Boolean.TRUE);
			out.setMensaje(e.getMessage());
			out.setCod(e.getCodError());
			
		}
		return out;
	}
	
	@ApiOperation(value = POST_TOMADOR, code = 200, notes = "update Tomador", produces = "application/json")
	@PostMapping(POST_TOMADOR)
	public @ResponseBody WSResultTomadorOUT updateTomador(@RequestBody Tomador tomador) throws Exception {
	
		WSResultTomadorOUT out = new  WSResultTomadorOUT();
		
		try {
			Tomador resul = opTomador.updateTomador(tomador);
			
			out.setTomador(resul);
			out.setResultado(RESULTADO_OK);
			out.setExisteError(Boolean.FALSE);
			out.setMensaje(MSG_OK);
	
		} catch(WSRunExcepcion e) {
			out.setResultado(RESULTADO_KO);
			out.setExisteError(Boolean.TRUE);
			out.setMensaje(e.getMessage());
			out.setCod(e.getCodError());
			
		}
		return out;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = GET_TOMADOR, code = 200, notes = "Get Tomador by ID Poliza", produces = "application/json")
	@RequestMapping(value = GET_TOMADOR, method = RequestMethod.GET)
	public @ResponseBody WSResultTomadorOUT getTomadorByIdPoliza(
			@PathVariable("idpoliza") Integer idpoliza
			) throws Exception {
	
		WSResultTomadorOUT out = new  WSResultTomadorOUT();
		
		try {
			Tomador resul = opTomador.getTomadorByPoliza(idpoliza);
			
			out.setTomador(resul);
			out.setResultado(RESULTADO_OK);
			out.setExisteError(Boolean.FALSE);
			out.setMensaje(MSG_OK);
	
		} catch(WSRunExcepcion e) {
			out.setResultado(RESULTADO_KO);
			out.setExisteError(Boolean.TRUE);
			out.setMensaje(e.getMessage());
			out.setCod(e.getCodError());
			
		}
		return out;
	}
}

