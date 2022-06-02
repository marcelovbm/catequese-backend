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

import br.com.magrinelli.catequese.entity.Address;

@RestController
@RequestMapping(value = "/person/{person}/address")
public class AddressController {

	private static final String ID = "/{id}";

	@GetMapping
	public ResponseEntity<List<Address>> list(@PathVariable Long person) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@GetMapping(value = ID)
	public ResponseEntity<Address> get(@PathVariable Long person, @PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@PostMapping
	public ResponseEntity<Address> add(@PathVariable Long person, @RequestBody Address address) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@PutMapping
	public ResponseEntity<Address> update(@PathVariable Long person, @RequestBody Address address) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@DeleteMapping(value = ID)
	public ResponseEntity<?> delete(@PathVariable Long person) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}
}
