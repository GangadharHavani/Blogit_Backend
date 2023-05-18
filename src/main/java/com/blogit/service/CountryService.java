package com.blogit.service;

import java.util.List;

import com.blogit.entity.Country;

public interface CountryService {
    Country getCountryById(Long id);
    Country getCountryByName(String name);
    List<Country> getCountryList();
}
