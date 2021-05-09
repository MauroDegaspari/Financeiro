package com.maurodegaspari.financas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public ResponseEntity<Page<GastoModel>> todos(Pageable pageable){
		Page<GastoModel> lista = service.todosGastos(pageable);
		return ResponseEntity.ok(lista);
	}

}
