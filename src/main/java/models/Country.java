package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "Country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Country_name")
    private String countryName;

    @OneToMany (mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<City> cityList;


    public Country() {
    }

    public Country(String countryName) {
        this.countryName = countryName;
        cityList = new ArrayList<>();
    }

    public void addCity (City city){
        city.setCountry(this);
        cityList.add(city);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "\nCountry data: " +
                "ID =" + id +
                "  |  Country name = " + countryName  +
                "  |  Cities = " + getCityList().toString();
    }
}

