package com.example.trader.repositories;

import com.example.trader.entities.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepo extends CrudRepository<City, String> {
    List<City> findAll();
}
