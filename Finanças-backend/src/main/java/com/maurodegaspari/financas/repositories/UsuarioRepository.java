package com.maurodegaspari.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maurodegaspari.financas.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
