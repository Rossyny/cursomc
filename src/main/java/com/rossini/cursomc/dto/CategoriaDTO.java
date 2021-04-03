package com.rossini.cursomc.dto;

import java.io.Serializable;

import com.rossini.cursomc.domain.Categoria;

//Data Transfer Object - esta classe serve para buscar somente o necessário do BD
// nesse caso, ao fazer o SELECT das categorias, os produtos estavam vindo também
public class CategoriaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public CategoriaDTO() {
	}
	
	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
