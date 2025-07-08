package com.example.countryservice.service;

import com.example.countryservice.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    Optional<Country> findByCode(String coCode);
    Country addCountry(Country country);
    Country updateCountry(Country country);
    void deleteCountry(String coCode);
    List<Country> findByPartialName(String namePart);
}
