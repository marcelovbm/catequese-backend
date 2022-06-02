package br.com.magrinelli.catequese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.magrinelli.catequese.entity.Person;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {

}
