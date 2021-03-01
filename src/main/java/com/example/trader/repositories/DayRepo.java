package com.example.trader.repositories;

import com.example.trader.entities.Day;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DayRepo extends CrudRepository<Day, String> {
    List<Day> findAll();
}
