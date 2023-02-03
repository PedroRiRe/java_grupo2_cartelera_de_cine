package proyecto2.com.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "director")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    private  String surname;

    private String cityBirth;
    private String country;
    private LocalDate dateBirth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Director() {
    }

    public Director(String name, String surname, String cityBirth, String country, LocalDate dateBirth) {
        this.name = name;
        this.surname = surname;
        this.cityBirth = cityBirth;
        this.country = country;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public Director setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Director setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getCityBirth() {
        return cityBirth;
    }

    public Director setCityBirth(String cityBirth) {
        this.cityBirth = cityBirth;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Director setCountry(String country) {
        this.country = country;
        return this;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public Director setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
        return this;
    }


    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cityBirth='" + cityBirth + '\'' +
                ", country='" + country + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}