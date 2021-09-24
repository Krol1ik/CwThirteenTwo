import models.City;
import models.Country;
import serviceCountry.CountryService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CountryService countryService = new CountryService();

        Country countryBlr = new Country("BLR");
        City minsk = new City("Minsk");
        City brest = new City("Brest");
        countryBlr.addCity(minsk);
        countryBlr.addCity(brest);
        countryService.saveCountry(countryBlr);

        Country countryRussia = new Country("Russia");
        City moscow = new City("Moscow");
        City spb = new City("SPB");
        countryRussia.addCity(moscow);
        countryRussia.addCity(spb);
        countryService.saveCountry(countryRussia);

        List<Country> findAll = countryService.findAll();
        System.out.println(findAll);

    }
}
