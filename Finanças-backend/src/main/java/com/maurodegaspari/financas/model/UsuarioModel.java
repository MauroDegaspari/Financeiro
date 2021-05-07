package com.maurodegaspari.financas.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tb_usuario")
public class UsuarioModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String usuario;
	
	@OneToMany(mappedBy = "usuario")
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
	
}
