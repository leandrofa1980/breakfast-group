package br.com.leandrofa1980.desafiomv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leandrofa1980.desafiomv.dto.OptCollaboratorDTO;
import br.com.leandrofa1980.desafiomv.dto.OptionDTO;
import br.com.leandrofa1980.desafiomv.services.OptionService;

@RestController
@RequestMapping(value = "/options")
public class OptionController {

	@Autowired
	private OptionService service;

	@GetMapping
	public ResponseEntity<Page<OptionDTO>> findAll(Pageable pageable) {
		Page<OptionDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/records")
	public ResponseEntity<List<OptCollaboratorDTO>> breakfastChoiceGroup() {
		List<OptCollaboratorDTO> list = service.breakfastChoiceGroup();
		return ResponseEntity.ok(list);
	}

//	@GetMapping(value = "/{id}")
//	public ResponseEntity<OptionDTO> findById(@PathVariable Long id) {
//		OptionDTO dto = service.findById(id);
//		return ResponseEntity.ok().body(dto);
//	}
//
//	@PostMapping
//	public ResponseEntity<OptionDTO> insert(@RequestBody OptionDTO dto) {
//		dto = service.insert(dto);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
//		return ResponseEntity.created(uri).body(dto);
//	}
//
//	@PutMapping(value = "/{id}")
//	public ResponseEntity<OptionDTO> update(@PathVariable Long id, @RequestBody OptionDTO dto) {
//		dto = service.update(id, dto);
//		return ResponseEntity.ok().body(dto);
//	}
//
//	@DeleteMapping(value = "/{id}")
//	public ResponseEntity<OptionDTO> delete(@PathVariable Long id) {
//		service.delete(id);
//		return ResponseEntity.noContent().build();
//	}
}
