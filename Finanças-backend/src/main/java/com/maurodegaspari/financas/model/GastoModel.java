package com.maurodegaspari.financas.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_gasto")
public class GastoModel {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visitados;
	private double gasto;
	private LocalDate data; 
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private UsuarioModel usuario;
		
		// construtores
	public GastoModel() {
		
	}
	
	
	public GastoModel(Long id, Integer visitados, double gasto, LocalDate data, UsuarioModel usuario) {
		super();
		this.id = id;
		this.visitados = visitados;
		this.gasto = gasto;
		this.data = data;
		this.usuario = usuario;
	}

		//gets & sets
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisitados() {
		return visitados;
	}

	public void setVisitados(Integer visitados) {
		this.visitados = visitados;
	}

	public double getGasto() {
		return gasto;
	}

	public void setGasto(double gasto) {
		this.gasto = gasto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	
	
}
