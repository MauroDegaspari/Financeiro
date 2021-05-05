package com.maurodegaspari.financas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsuarioModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String usuario;
	
	private List<GastoModel> gasto = new ArrayList<>(); 

	// construtores
	public UsuarioModel() {

	}

	public UsuarioModel(Long id, String usuario) {
		super();
		this.id = id;
		this.usuario = usuario;
	}

	// Gets & Sets
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<GastoModel> getGasto() {
		return gasto;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
