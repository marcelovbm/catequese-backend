package br.com.magrinelli.catequese.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.magrinelli.catequese.entity.Address;

@Repository
public interface IAddressService {
    
    public Address create(final Address address);

    public Address get(final Long addressId);

    public List<Address> list();

    public void delete(final Long addressId);

    public Address update(final Address address);
}
