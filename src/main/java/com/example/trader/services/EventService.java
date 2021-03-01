package com.example.trader.services;

import com.example.trader.entities.Event;
import com.example.trader.repositories.EventRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventService {
    private final EventRepo eventRepo;

    public void saveEvent(Event event) {
        eventRepo.save(event);
    }

    public List<Event> getEvents() {
        return eventRepo.findAll();
    }
}
