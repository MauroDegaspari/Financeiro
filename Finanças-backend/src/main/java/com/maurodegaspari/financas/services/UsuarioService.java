package com.maurodegaspari.financas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurodegaspari.financas.model.UsuarioModel;
import com.maurodegaspari.financas.repositories.UsuarioRepository;

@Service // componente
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<UsuarioModel> todosUsuarios(){
		return repository.findAll();
	}
	
}
