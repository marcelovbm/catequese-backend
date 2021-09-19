package br.com.magrinelli.catequese.service;

import java.util.List;

import br.com.magrinelli.catequese.entity.City;

public interface ICityService {

    public City create(City city);

    public City get(Long cityId);

    public List<City> list();

    public Boolean delete(Long cityId);

    public City update(City city);
}
