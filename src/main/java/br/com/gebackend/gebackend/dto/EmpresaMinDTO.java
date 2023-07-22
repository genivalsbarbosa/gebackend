package br.com.gebackend.gebackend.dto;

import br.com.gebackend.gebackend.entities.Empresa;

public class EmpresaMinDTO {
	
	private Long id;
	private String nome;
	
	public EmpresaMinDTO() {
	}
	
	public EmpresaMinDTO(Empresa entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	
	
	

}
