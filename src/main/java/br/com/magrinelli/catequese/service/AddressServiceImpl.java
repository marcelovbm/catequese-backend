package br.com.magrinelli.catequese.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.magrinelli.catequese.entity.Address;
import br.com.magrinelli.catequese.repository.IAddressRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements IAddressService {

	private final IAddressRepository addressRepository;

	@Override
	public Address create(final Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address get(final Long addressId) {
		return addressRepository.getById(addressId);
	}

	@Override
	public List<Address> list() {
		return addressRepository.findAll();
	}

	@Override
	public void delete(final Long addressId) {
		addressRepository.deleteById(addressId);
	}

	@Override
	public Address update(Address address) {
		return addressRepository.save(address);
	}

}
