package com.example.countryservice.controller;

import com.example.countryservice.model.Country;
import com.example.countryservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public ResponseEntity<Country> getByCode(@PathVariable String code) {
        return countryService.findByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Country> create(@RequestBody Country country) {
        return ResponseEntity.ok(countryService.addCountry(country));
    }

    @PutMapping
    public ResponseEntity<Country> update(@RequestBody Country country) {
        return ResponseEntity.ok(countryService.updateCountry(country));
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Void> delete(@PathVariable String code) {
        countryService.deleteCountry(code);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public List<Country> search(@RequestParam String name) {
        return countryService.findByPartialName(name);
    }
}
