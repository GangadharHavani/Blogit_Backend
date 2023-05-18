package com.blogit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogit.entity.Country;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Optional<Country> findByName(String name);
}
