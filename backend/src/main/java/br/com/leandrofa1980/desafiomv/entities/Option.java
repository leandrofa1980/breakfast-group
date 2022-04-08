package br.com.leandrofa1980.desafiomv.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_option")
public class Option implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String breakfastChoice;
	
	public Option() {
	}

	public Option(Long id, String breakfastChoice) {
		this.id = id;
		this.breakfastChoice = breakfastChoice;
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
		Option other = (Option) obj;
		return Objects.equals(id, other.id);
	}
}
