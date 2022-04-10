package br.com.leandrofa1980.desafiomv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.leandrofa1980.desafiomv.dto.OptCollaboratorDTO;
import br.com.leandrofa1980.desafiomv.dto.OptionDTO;
import br.com.leandrofa1980.desafiomv.entities.Option;
import br.com.leandrofa1980.desafiomv.repositories.CollaboratorRepository;
import br.com.leandrofa1980.desafiomv.repositories.OptionRepository;

@Service
public class OptionService {

	@Autowired
	private OptionRepository repository;
	
	@Autowired
	private CollaboratorRepository collaboratorRepository;
	
	@Transactional(readOnly = true)
	public Page<OptionDTO> findAll(Pageable pageable) {
		collaboratorRepository.findAll();
		Page<Option> list = repository.findAll(pageable);
		return list.map(x -> new OptionDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<OptCollaboratorDTO> breakfastChoiceGroup(){
		return repository.breakfastChoiceGroup();
	}

//	@Transactional(readOnly = true)
//	public List<OptionDTO> findAll() {
//		List<Option> list = repository.findAll();
//		return list.stream().map(x -> new OptionDTO(x)).collect(Collectors.toList());
//	}
//
//	@Transactional(readOnly = true)
//	public OptionDTO findById(Long id) {
//		Optional<Option> obj = repository.findById(id);
//		Option entity = obj.orElseThrow(() -> new OptionNotFoundException("Option not found"));
//		return new OptionDTO(entity);
//	}
//
//	@Transactional
//	public OptionDTO insert(OptionDTO dto) {
//		try {
//			Option entity = new Option();
//			entity.setBreakfastChoice(dto.getBreakfastChoice());
//			entity = repository.save(entity);
//			return new OptionDTO(entity);
//		} catch (DataIntegrityViolationException e) {
//			throw new DatabaseException("Integration violation");
//		}
//	}
//
//	@Transactional
//	public OptionDTO update(Long id, OptionDTO dto) {
//		try {
//			Option entity = repository.getById(id);
//			entity.setBreakfastChoice(dto.getBreakfastChoice());
//			entity = repository.save(entity);
//			return new OptionDTO(entity);
//		} catch (EntityNotFoundException e) {
//			throw new OptionNotFoundException("Id not found " + id);
//		}
//	}
//
//	public void delete(Long id) {
//		try {
//			repository.deleteById(id);
//		} catch (EmptyResultDataAccessException e) {
//			throw new OptionNotFoundException("Id not found " + id);
//		} catch (DataIntegrityViolationException e) {
//			throw new DatabaseException("Integration violation");
//		}
//	}
}
