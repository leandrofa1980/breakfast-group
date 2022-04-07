package br.com.leandrofa1980.desafiomv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leandrofa1980.desafiomv.entities.Collaborator;
import br.com.leandrofa1980.desafiomv.services.CollaboratorService;

@RestController
@RequestMapping(value = "/collaborators")
public class CollaboratorController {

	@Autowired
	private CollaboratorService service;
	
	@GetMapping
	public ResponseEntity<List<Collaborator>> findAll(){
		List<Collaborator> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
