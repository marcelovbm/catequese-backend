package br.com.magrinelli.catequese.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magrinelli.catequese.entity.City;

public interface ICityRepository extends JpaRepository<City, Long> {

}
