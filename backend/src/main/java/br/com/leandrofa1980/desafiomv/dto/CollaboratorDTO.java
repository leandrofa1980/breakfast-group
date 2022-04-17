package br.com.leandrofa1980.desafiomv.dto;

import java.io.Serializable;

import br.com.leandrofa1980.desafiomv.entities.Collaborator;

public class CollaboratorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	private String breakfastChoice;
	
	public CollaboratorDTO() {}

	public CollaboratorDTO(Long id, String name, String cpf, String breakfastChoice) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.breakfastChoice = breakfastChoice;
	}
	
	public CollaboratorDTO(Collaborator entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		breakfastChoice = entity.getBreakfastChoice();
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

	public String getBreakfastChoice() {
		return breakfastChoice;
	}

	public void setBreakfastChoice(String breakfastChoice) {
		this.breakfastChoice = breakfastChoice;
	}
}
