package com.example.continentservice.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private long areaSqKm;
    private long population;
    private int countries;

    @ElementCollection
    private List<String> lines;

    @ElementCollection
    private List<String> oceans;

    @ElementCollection
    private List<String> developedCountries;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAreaSqKm() {
        return areaSqKm;
    }

    public void setAreaSqKm(long areaSqKm) {
        this.areaSqKm = areaSqKm;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getCountries() {
        return countries;
    }

    public void setCountries(int countries) {
        this.countries = countries;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public List<String> getOceans() {
        return oceans;
    }

    public void setOceans(List<String> oceans) {
        this.oceans = oceans;
    }

    public List<String> getDevelopedCountries() {
        return developedCountries;
    }

    public void setDevelopedCountries(List<String> developedCountries) {
        this.developedCountries = developedCountries;
    }
}
