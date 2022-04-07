package br.com.leandrofa1980.desafiomv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.leandrofa1980.desafiomv.entities.Collaborator;
import br.com.leandrofa1980.desafiomv.repositories.CollaboratorRepository;

@Service
public class CollaboratorService {
	
	@Autowired
	private CollaboratorRepository repository;

	@Transactional(readOnly = true)
	public List<Collaborator> findAll(){
		return repository.findAll();
	}
}
