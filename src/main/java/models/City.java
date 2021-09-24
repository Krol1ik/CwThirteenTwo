package models;

import javax.persistence.*;

@Entity
@Table (name = "City")
public class City {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "City_name")
    private String cityName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "Country_id")
    private Country country;

    public City() {
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return  cityName;
    }
}
