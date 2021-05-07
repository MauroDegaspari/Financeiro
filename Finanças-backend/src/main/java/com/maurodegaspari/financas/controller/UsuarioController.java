package com.maurodegaspari.financas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.financas.model.UsuarioModel;
import com.maurodegaspari.financas.services.UsuarioService;

@RestController
@RequestMapping(value ="/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioModel>> todos(){
		List<UsuarioModel> lista = usuarioService.todosUsuarios();
		return ResponseEntity.ok(lista);
	}

}
