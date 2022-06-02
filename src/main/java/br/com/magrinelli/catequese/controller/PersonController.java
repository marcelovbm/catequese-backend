package br.com.magrinelli.catequese.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magrinelli.catequese.entity.Person;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

	private static final String ID = "/{id}";

	@GetMapping
	public ResponseEntity<List<Person>> list() {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@GetMapping(value = ID)
	public ResponseEntity<Person> get(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@PostMapping
	public ResponseEntity<Person> add(@RequestBody Person person) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@PutMapping
	public ResponseEntity<Person> update(@RequestBody Person person) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@DeleteMapping(value = ID)
	public ResponseEntity<?> delete() {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}
}
