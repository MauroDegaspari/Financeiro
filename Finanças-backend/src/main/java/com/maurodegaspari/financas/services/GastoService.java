package com.maurodegaspari.financas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurodegaspari.financas.model.GastoModel;
import com.maurodegaspari.financas.repositories.GastoRepository;

@Service
public class GastoService {

	@Autowired
	private GastoRepository repository;
	
	public List<GastoModel> todosGastos(){
		return repository.findAll();
	}
}
