package br.com.leandrofa1980.desafiomv.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.leandrofa1980.desafiomv.dto.CollaboratorDTO;
import br.com.leandrofa1980.desafiomv.entities.Collaborator;
import br.com.leandrofa1980.desafiomv.repositories.CollaboratorRepository;
import br.com.leandrofa1980.desafiomv.services.exception.CollaboratorNotFoundException;
import br.com.leandrofa1980.desafiomv.services.exception.DatabaseException;

@Service
public class CollaboratorService {

	@Autowired
	private CollaboratorRepository repository;

	@Transactional(readOnly = true)
	public Page<CollaboratorDTO> findAllPaged(Pageable pageable) {
		Page<Collaborator> list = repository.findAll(pageable);
		return list.map(x -> new CollaboratorDTO(x));
	}

	@Transactional(readOnly = true)
	public CollaboratorDTO findById(Long id) {
		Optional<Collaborator> obj = repository.findById(id);
		Collaborator entity = obj.orElseThrow(() -> new CollaboratorNotFoundException("Collaborator not found"));
		return new CollaboratorDTO(entity);
	}

	@Transactional
	public CollaboratorDTO insert(CollaboratorDTO dto) {
		try {
			Collaborator entity = new Collaborator();
			copyDtoToEntity(dto, entity);
			return new CollaboratorDTO(entity);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integration violation");
		}
	}

	@Transactional
	public CollaboratorDTO update(Long id, CollaboratorDTO dto) {
		try {
			Collaborator entity = repository.getById(id);
			copyDtoToEntity(dto, entity);
			return new CollaboratorDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new CollaboratorNotFoundException("Id not found " + id);
		}
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new CollaboratorNotFoundException("Id not found " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integration violation");
		}
	}

	private void copyDtoToEntity(CollaboratorDTO dto, Collaborator entity) {
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setBreakfastChoice(dto.getBreakfastChoice());
		entity = repository.save(entity);
	}
}
