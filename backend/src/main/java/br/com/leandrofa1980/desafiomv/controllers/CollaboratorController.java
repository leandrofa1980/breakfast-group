package br.com.leandrofa1980.desafiomv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leandrofa1980.desafiomv.dto.CollaboratorDTO;
import br.com.leandrofa1980.desafiomv.services.CollaboratorService;

@RestController
@RequestMapping(value = "/collaborators")
public class CollaboratorController {

	@Autowired
	private CollaboratorService service;

	@GetMapping
	public ResponseEntity<List<CollaboratorDTO>> findAll() {
		List<CollaboratorDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}

//	public ResponseEntity<Page<CollaboratorDTO>> findAll(@RequestParam(value = "page", defaultValue = "0") Integer page,
//
//			@RequestParam(value = "linesPerPage", defaultValue = "5") Integer linesPerPage,
//
//			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
//
//			@RequestParam(value = "orderBy", defaultValue = "name") String orderBy) {
//
//		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
//		Page<CollaboratorDTO> list = service.findAllPaged(pageRequest);
//		return ResponseEntity.ok().body(list);
//	}
//
//	@GetMapping(value = "/{id}")
//	public ResponseEntity<CollaboratorDTO> findById(@PathVariable Long id) {
//		CollaboratorDTO dto = service.findById(id);
//		return ResponseEntity.ok().body(dto);
//	}

//	@PostMapping
//	public ResponseEntity<CollaboratorDTO> insert(@RequestBody CollaboratorDTO dto) {
//		dto = service.insert(dto);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
//		return ResponseEntity.created(uri).body(dto);
//	}
//
//	@PutMapping(value = "/{id}")
//	public ResponseEntity<CollaboratorDTO> update(@PathVariable Long id, @RequestBody CollaboratorDTO dto) {
//		dto = service.update(id, dto);
//		return ResponseEntity.ok().body(dto);
//	}
//
//	@DeleteMapping(value = "/{id}")
//	public ResponseEntity<CollaboratorDTO> delete(@PathVariable Long id) {
//		service.delete(id);
//		return ResponseEntity.noContent().build();
//	}
}
