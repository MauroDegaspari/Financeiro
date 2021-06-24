package com.maurodegaspari.financas.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maurodegaspari.financas.DTO.SomatorioDTO;
import com.maurodegaspari.financas.entidades.Vendas;

public interface VendasRepositorio extends JpaRepository<Vendas, Long>{

	@Query("SELECT NEW com.maurodegaspari.financas.DTO.SomatorioDTO(obj.vendedor, SUM(obj.soma)) "
		 + "FROM Vendas AS obj GROUP BY obj.vendedor")
	List<SomatorioDTO> somaFuncRepositorio();
}
