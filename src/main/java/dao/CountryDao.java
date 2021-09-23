package dao;

import models.Country;

import java.util.List;

public interface CountryDao {

    Country findId(int id);
    void save (Country users);
    void update (Country users);
    void delete (Country users);
    List<Country> findAllCountry ();
}
