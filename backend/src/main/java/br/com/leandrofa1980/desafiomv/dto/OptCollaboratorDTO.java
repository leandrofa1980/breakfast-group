package br.com.leandrofa1980.desafiomv.dto;

import java.io.Serializable;

import br.com.leandrofa1980.desafiomv.entities.Collaborator;

public class OptCollaboratorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String collaboratorName;
	private String breakfastChoice;
	
	public OptCollaboratorDTO() {}

	public OptCollaboratorDTO(Collaborator collaborator, String breakfastChoice) {
		this.collaboratorName = collaborator.getName();
		this.breakfastChoice = breakfastChoice;
	}

	public String getCollaboratorName() {
		return collaboratorName;
	}

	public void setCollaboratorName(String collaboratorName) {
		this.collaboratorName = collaboratorName;
	}

	public String getBreakfastChoice() {
		return breakfastChoice;
	}

	public void setBreakfastChoice(String breakfastChoice) {
		this.breakfastChoice = breakfastChoice;
	}
}
