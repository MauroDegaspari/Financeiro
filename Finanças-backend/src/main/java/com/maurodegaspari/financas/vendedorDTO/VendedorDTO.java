package com.maurodegaspari.financas.vendedorDTO;

import java.io.Serializable;

import com.maurodegaspari.financas.entidades.Vendedor;

public class VendedorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	
	public VendedorDTO() {}

	public VendedorDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public VendedorDTO(Vendedor vendedor) {
		id = vendedor.getId();
		nome = vendedor.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
