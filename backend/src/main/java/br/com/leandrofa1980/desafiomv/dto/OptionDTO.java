package br.com.leandrofa1980.desafiomv.dto;

import java.io.Serializable;
import java.util.Objects;

import br.com.leandrofa1980.desafiomv.entities.Option;

public class OptionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String breakfastChoice;
	
	public OptionDTO() {}

	public OptionDTO(Long id, String breakfastChoice) {
		this.id = id;
		this.breakfastChoice = breakfastChoice;
	}
	
	public OptionDTO(Option entity) {
		this.id = entity.getId();
		this.breakfastChoice = entity.getBreakfastChoice();
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionDTO other = (OptionDTO) obj;
		return Objects.equals(id, other.id);
	}
}
