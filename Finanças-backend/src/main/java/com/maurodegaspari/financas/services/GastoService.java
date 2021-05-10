package com.maurodegaspari.financas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.maurodegaspari.financas.model.GastoModel;
import com.maurodegaspari.financas.repositories.GastoRepository;

@Service
public class GastoService {

	@Autowired
	private GastoRepository repository;
	
	public Page<GastoModel> todosGastos(Pageable pageable){
		return repository.findAll(pageable);
	}
}
