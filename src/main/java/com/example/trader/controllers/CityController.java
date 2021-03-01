package com.example.trader.controllers;

import com.example.trader.entities.City;
import com.example.trader.enums.CityName;
import com.example.trader.services.CityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/cities")
@AllArgsConstructor
public class CityController {
    private final CityService cityService;

    @PostMapping("/city")
    public ResponseEntity<Void> addCity() {
        for (int i = 0; i < CityName.values().length; i++) {
            City city = City.builder()
                    .name(CityName.values()[i])
                    .distance(new Random().nextInt(5) + 10)
                    .build();
            cityService.saveCity(city);
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/city")
    public City getCity() {
        return cityService.getCity();
    }
}
