package com.maurodegaspari.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maurodegaspari.financas.model.GastoModel;

public interface GastoRepository extends JpaRepository<GastoModel, Long> {

}
