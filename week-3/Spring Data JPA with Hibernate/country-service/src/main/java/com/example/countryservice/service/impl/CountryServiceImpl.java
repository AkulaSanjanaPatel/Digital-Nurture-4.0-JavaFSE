package com.example.countryservice.service.impl;

import com.example.countryservice.model.Country;
import com.example.countryservice.repository.CountryRepository;
import com.example.countryservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Optional<Country> findByCode(String coCode) {
        return countryRepository.findById(coCode);
    }

    @Override
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        if (!countryRepository.existsById(country.getCoCode())) {
            throw new RuntimeException("Country not found");
        }
        return countryRepository.save(country);
    }

    @Override
    public void deleteCountry(String coCode) {
        countryRepository.deleteById(coCode);
    }

    @Override
    public List<Country> findByPartialName(String namePart) {
        return countryRepository.findByCoNameContainingIgnoreCase(namePart);
    }
}
