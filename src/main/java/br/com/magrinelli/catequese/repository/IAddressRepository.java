package br.com.magrinelli.catequese.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magrinelli.catequese.entity.Address;

public interface IAddressRepository extends JpaRepository<Address, Long> {

}
