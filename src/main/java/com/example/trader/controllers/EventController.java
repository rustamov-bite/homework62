package com.example.trader.controllers;

import com.example.trader.entities.Event;
import com.example.trader.enums.Action;
import com.example.trader.services.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
@AllArgsConstructor
public class EventController {
    private final EventService eventService;

    @PostMapping("/event")
    public ResponseEntity<Void> saveEvent() {
        for (int i = 0; i < Action.values().length; i++) {
            Event event = Event.builder()
                    .action(Action.values()[i])
                    .build();
            eventService.saveEvent(event);
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/event")
    public List<Event> getEvents() {
        return eventService.getEvents();
    }
}
