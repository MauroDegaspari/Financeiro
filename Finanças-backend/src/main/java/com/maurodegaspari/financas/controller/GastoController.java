package com.maurodegaspari.financas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.financas.model.GastoModel;
import com.maurodegaspari.financas.services.GastoService;

@RestController
@RequestMapping(value ="/gastos")
public class GastoController {

	@Autowired
	private GastoService service;	
	
	@GetMapping
	public ResponseEntity<List<GastoModel>> todos(){
		List<GastoModel> lista = service.todosGastos();
		return ResponseEntity.ok(lista);
	}

}
