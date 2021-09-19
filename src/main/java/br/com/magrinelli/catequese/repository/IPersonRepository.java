package br.com.magrinelli.catequese.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magrinelli.catequese.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Long>{
    
}
