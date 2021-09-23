package serviceCountry;

import dao.CountryDaoImpl;
import models.Country;

import java.util.List;

public class CountryService {
    private CountryDaoImpl countryDao = new CountryDaoImpl();

    public void saveCountry (Country country){
        countryDao.save(country);
    }

    public void updateCountry (Country country){
        countryDao.delete(country);
    }

    public void deleteCountry (Country country){
        countryDao.delete(country);
    }

    public Country findById (int id){
        return countryDao.findId(id);
    }

    public List<Country> findAll (){
        return countryDao.findAllCountry();
    }
}
