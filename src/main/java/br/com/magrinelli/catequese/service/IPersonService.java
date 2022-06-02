package br.com.magrinelli.catequese.service;

import java.util.List;

import br.com.magrinelli.catequese.entity.Person;

public interface IPersonService {

	public Person create(Person person);

	public Person get(Long personId);

	public List<Person> list();

	public Boolean delete(Long personId);

	public Person update(Person person);
}
