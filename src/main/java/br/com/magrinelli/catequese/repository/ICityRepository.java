package br.com.magrinelli.catequese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.magrinelli.catequese.entity.City;

@Repository
public interface ICityRepository extends JpaRepository<City, Long> {

}
