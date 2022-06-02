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

import br.com.magrinelli.catequese.entity.City;

@RestController
@RequestMapping(value = "/person/{person}/edress/{edress}/city")
public class CityController {

	private static final String ID = "/{id}";

	@GetMapping
	public ResponseEntity<List<City>> list(@PathVariable Long person, @PathVariable Long edress) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@GetMapping(value = ID)
	public ResponseEntity<City> get(@PathVariable Long person, @PathVariable Long edress, @PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@PostMapping
	public ResponseEntity<City> add(@PathVariable Long person, @PathVariable Long edress, @RequestBody City city) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();

	}

	@PutMapping
	public ResponseEntity<City> update(@PathVariable Long person, @PathVariable Long edress, @RequestBody City city) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@DeleteMapping(value = ID)
	public ResponseEntity<?> delete(@PathVariable Long person, @PathVariable Long edress, @PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}
}
