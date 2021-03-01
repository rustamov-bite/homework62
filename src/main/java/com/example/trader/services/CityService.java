package com.example.trader.services;

import com.example.trader.entities.City;
import com.example.trader.repositories.CityRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityService {
    private final CityRepo cityRepo;

    public void saveCity(City city) {
        cityRepo.save(city);
    }

    public City getCity() {
        List<City> cityList = cityRepo.findAll();
        return cityList.get(0);
    }
}
