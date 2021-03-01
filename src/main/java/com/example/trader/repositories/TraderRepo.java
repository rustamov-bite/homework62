package com.example.trader.repositories;

import com.example.trader.entities.Trader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraderRepo extends CrudRepository<Trader, String> {
    List<Trader> findAll();
    Trader findTraderByName(String name);
}
