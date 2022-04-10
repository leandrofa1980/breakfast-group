package br.com.leandrofa1980.desafiomv.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.leandrofa1980.desafiomv.dto.OptionDTO;
import br.com.leandrofa1980.desafiomv.entities.Option;
import br.com.leandrofa1980.desafiomv.repositories.OptionRepository;
import br.com.leandrofa1980.desafiomv.services.exception.DatabaseException;
import br.com.leandrofa1980.desafiomv.services.exception.OptionNotFoundException;

@Service
public class OptionService {

	@Autowired
	private OptionRepository repository;

	@Transactional(readOnly = true)
	public List<OptionDTO> findAll() {
		List<Option> list = repository.findAll();
		return list.stream().map(x -> new OptionDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public OptionDTO findById(Long id) {
		Optional<Option> obj = repository.findById(id);
		Option entity = obj.orElseThrow(() -> new OptionNotFoundException("Option not found"));
		return new OptionDTO(entity);
	}

	@Transactional
	public OptionDTO insert(OptionDTO dto) {
		try {
			Option entity = new Option();
			entity.setBreakfastChoice(dto.getBreakfastChoice());
			entity = repository.save(entity);
			return new OptionDTO(entity);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integration violation");
		}
	}

	@Transactional
	public OptionDTO update(Long id, OptionDTO dto) {
		try {
			Option entity = repository.getById(id);
			entity.setBreakfastChoice(dto.getBreakfastChoice());
			entity = repository.save(entity);
			return new OptionDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new OptionNotFoundException("Id not found " + id);
		}
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new OptionNotFoundException("Id not found " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integration violation");
		}
	}
}
