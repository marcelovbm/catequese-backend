package br.com.magrinelli.catequese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.magrinelli.catequese.entity.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Long> {

}
