package com.example.trader.repositories;

import com.example.trader.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event, String> {
    List<Event> findAll();
}
