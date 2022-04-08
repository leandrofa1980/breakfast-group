package br.com.leandrofa1980.desafiomv.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import br.com.leandrofa1980.desafiomv.entities.Collaborator;
import br.com.leandrofa1980.desafiomv.entities.Option;

public class CollaboratorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	
	private List<OptionDTO> options = new ArrayList<>();
	
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
	
	public CollaboratorDTO(Collaborator entity, Set<Option> options) {
		this(entity);
		options.forEach(opt -> this.options.add(new OptionDTO(opt)));
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

	public List<OptionDTO> getOptions() {
		return options;
	}

	public void setOptions(List<OptionDTO> options) {
		this.options = options;
	}	
}
