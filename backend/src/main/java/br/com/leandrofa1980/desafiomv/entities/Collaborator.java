package br.com.leandrofa1980.desafiomv.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_collaborator")
public class Collaborator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(unique = true)
	private String cpf;

	@ManyToMany
	@JoinTable(name = "tb_collaborator_option",
			joinColumns = @JoinColumn(name = "collaborator_id"), 
			inverseJoinColumns = @JoinColumn(name = "option_id"))
	Set<Option> options = new HashSet<>();

	public Collaborator() {
	}

	public Collaborator(Long id, String name, String cpf) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
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
	

	public Set<Option> getOptions() {
		return options;
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
		Collaborator other = (Collaborator) obj;
		return Objects.equals(id, other.id);
	}
}
