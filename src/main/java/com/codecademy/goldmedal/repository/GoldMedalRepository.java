package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {
    List<GoldMedal> findByCountry(String countryName);

    List<GoldMedal> findByCountryAndSeason(String name, String season);

    List<GoldMedal> findBySeason(String season);

    List<GoldMedal> findByCountryAndGender(String name, String gender);
}
