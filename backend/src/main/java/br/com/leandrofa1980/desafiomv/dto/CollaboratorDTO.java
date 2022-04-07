package br.com.leandrofa1980.desafiomv.dto;

import br.com.leandrofa1980.desafiomv.entities.Collaborator;

public class CollaboratorDTO {
	
	private Long id;
	private String name;
	private String cpf;
	
	public CollaboratorDTO() {}

	public CollaboratorDTO(Long id,String name, String cpf) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}
	
	public CollaboratorDTO(Collaborator entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
