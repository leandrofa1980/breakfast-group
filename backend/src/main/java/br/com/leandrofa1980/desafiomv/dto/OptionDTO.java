package br.com.leandrofa1980.desafiomv.dto;

import java.io.Serializable;

import br.com.leandrofa1980.desafiomv.entities.Option;

public class OptionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String breakfastChoice;
	
	private CollaboratorDTO collaboratorDTO;
	
	public OptionDTO() {}

	public OptionDTO(Long id, String breakfastChoice, CollaboratorDTO collaboratorDTO) {
		this.id = id;
		this.breakfastChoice = breakfastChoice;
		this.collaboratorDTO = collaboratorDTO;
	}
	
	public OptionDTO(Option entity) {
		this.id = entity.getId();
		this.breakfastChoice = entity.getBreakfastChoice();
		this.collaboratorDTO = new CollaboratorDTO(entity.getCollaboratorDTO());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBreakfastChoice() {
		return breakfastChoice;
	}

	public void setBreakfastChoice(String breakfastChoice) {
		this.breakfastChoice = breakfastChoice;
	}

	public CollaboratorDTO getCollaboratorDTO() {
		return collaboratorDTO;
	}

	public void setCollaboratorDTO(CollaboratorDTO collaboratorDTO) {
		this.collaboratorDTO = collaboratorDTO;
	}
}
